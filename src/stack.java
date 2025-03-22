package src;
import lib.*;
import java.util.Scanner;
//@SuppressWarnings("unused")

//lib is disabled for now, this class is from lib
/*
class console {
    public static void clear() {
        System.out.print("\033[H\033[2J");
    }
}
*/

public class stack
{

    private Scanner scan = new Scanner(System.in);
    int top;

    int[] stack;
    public stack(int x)
    {
        stack = new int[x];
        top = -1;
    }

    private void display()
    {
        //console.clear();
        System.out.print("[ ");
        for(int i =0 ; i < stack.length ; i+=1)
        {
            System.out.print("'" + this.stack[i] + "'");
            if(i>-1 && i < stack.length-1)
            {
                System.out.print(" , ");
            }
        }
        System.out.print(" ]");
        System.out.println("");
    }

    private void push(int x)
    {
        if(top+1 < stack.length)
        {
            this.top += 1;
            this.stack[top] = x;
            System.out.print("The number "+ x +" is pushed in position " + (top+1) + "\n");
        }else
        {
            System.out.println("The stack is Full !!");
        }
    }

    private void pop() {
        if (top > -1) {
            int y = this.stack[top];
            this.stack[top] = 0;
            this.top -= 1;
            System.out.print("The " + (top + 2) + "th position is poped, data:" + y + "\n");

        } else {
            System.out.println("The stack is Empty !!");
        }
    }

    private void peek()
    {
        if(!(isEmpty()))
        {
            System.out.println("The top Points to position("+ (top+1) +"):"+ this.stack[top] +"");
        }else{
            System.out.println("There is no data in the stack to peek !!");
        }
    }

    private boolean isEmpty()
    {
        if(top == -1)
        {
            System.out.print("The stack is Empty !!\n");
            return true;
        }else{
            System.out.print("The stack is not Empty !!\n");
            return false;
        }
    }

    private boolean isFull() {
        if (top+1 == stack.length) {
            System.out.print("The stack is Full !!\n");
            return true;
        } else {
            System.out.print("The stack is not Full !!\n");
            return false;
        }
    }

    private void menu()
    {
        display();
	System.out.print("0. Exit\n");
        System.out.print("1. Push\n");
        System.out.print("2. Pop\n");
        System.out.print("3. Peek\n");
        System.out.print("4. isEmpty\n");
        System.out.print("5. isFull\n");
        System.out.print("9. Display\n");
        //System.out.print("9. Display\n");
        input();
    }

    /**
     * 
     */
    private void input()
    {
        System.out.print("Enter Your Choice: ");
        String input = scan.nextLine();

        if(input.equals("1"))
        {
            console.clear();
            System.out.print("Enter Integer number to add to the Stack: ");
            String push = scan.nextLine();
            this.push(Integer.valueOf(push));
            this.menu();
        }
        else if (input.equals("0"))
        {
            console.clear();
            return;
        }
        else if (input.equals("2"))
        {
            console.clear();
            //System.out.print("Enter Integer number to add to the Stack: ");
            //String push = scan.nextLine();
            this.pop();
            this.menu();
        }
        else if (input.equals("3")) {
            console.clear();
            // System.out.print("Enter Integer number to add to the Stack: ");
            // String push = scan.nextLine();
            this.peek();
            this.menu();
        }
        else if (input.equals("4")) {
            console.clear();
            // System.out.print("Enter Integer number to add to the Stack: ");
            // String push = scan.nextLine();
            this.isEmpty();
            this.menu();
        }
        else if (input.equals("5")) {
            console.clear();
            // System.out.print("Enter Integer number to add to the Stack: ");
            // String push = scan.nextLine();
            this.isFull();
            this.menu();
        }
        else if(input.equals("9"))
        {
            console.clear();
            this.display();
            this.menu();
        }
        else
        {
            console.clear();
            System.out.print("Wrong option\n");
            this.menu();
        }

    }

    public void app()
    {
        this.menu();
    }
    public static void main (String[] args)
    {

        stack stack = new stack(9);
        stack.app();
        //console.clear();
        

    }
}
