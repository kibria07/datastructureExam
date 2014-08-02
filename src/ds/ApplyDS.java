package ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ApplyDS {

	public static void main(String[] args) {
		/*
		 * UseStructure can be applied here to demonstrate how to add and retrieve.
		 * 
		 */
		

		
		LinkedList<String> list = new LinkedList<String>();
		UseStructure us = new UseStructure();
		us.returnByLinkedList("helo");
		us.addByLinkedList("A");
		us.returnByArrayList("moon");
		
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		
		Stack<String> stack = new Stack<String>();
		
		Queue<String> queue = new LinkedList<String>();
	}

}
