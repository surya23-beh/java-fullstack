package myproject_java_package;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		//printing elements
		System.out.println(stack);
		// peek (last element)
		System.out.println("peek :" + stack.peek());
		// pop 
		System.out.println("pop :" + stack.pop());
		System.out.print("After poping : ");
		System.out.println(stack);
		//search an element
		System.out.println("Position of b : " + stack.search("b"));
		// check empty
		System.out.println("Is stack empty : " + stack.empty());
	}

}
