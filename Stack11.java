package com.Stack.LL;

import java.util.Scanner;



 class Stack {
	
	class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
	
	Node top = null;
	
	public void push(Scanner sc) {
		System.out.println("Enter Data:");
		int data = sc.nextInt();
		Node new_node = new Node(data);
		if(top == null)
		{
			top = new_node;
		}
		else
		{
			new_node.next = top;
			top = new_node;
		}
		
	}
	
	public void pop(){
		
		if (top == null)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			top = top.next;
		}
	}
	
	public void display() {
		Node temp = top;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
}


public class Stack11 {

	public static void main(String[] args) {
		int d;
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		int l;
		do 
			{
				System.out.println("Enter 1 to push");
				System.out.println("Enter 2 to pop");
				System.out.println("Enter 3 to display");
				System.out.println("Enter your choice");
				d= sc.nextInt();
				switch(d)
				{
					case 1:
					{
						s.push(sc);
						break;
					}
					case 2:
					{
						s.pop();
						break;
					}
					case 3:
					{
						s.display();
						break;
					}
				}
				System.out.println("Enter 0 to go back");
				System.out.println("Enter any key to exit");
				
				l = sc.nextInt();
				
			} 
		while(l==0);
		System.out.println("EXIT");

	}

}
