package ds;

import java.util.*;

public class UseStructure {
	
	LinkedList<String> list;
	ArrayList<String> arrayList;
	Stack<String> stack;
	Queue<String> queue;
	
	//add data into the LinkedList
	public void addByLinkedList(String name){
		LinkedList<String> list = new LinkedList<String>();
		list.add("Apple");
	    list.add("Ball");
	    list.add("Car");
	    list.add("Don");
	    list.addFirst("Xebra");
	    list.addLast("Zeera");

	    System.out.println("this is linked list "+list);
		
	}
	//Retrieve data and return the LinkedList
	public LinkedList<String> returnByLinkedList(String name){
		
		    System.out.println("List Elements are ");
		    	while(list!=null){
		    		list.removeFirst();
		    		list.element();
		    }
		    			System.out.println(list);
			
		    			return list;
			
	}
	
	//add data into the ArrayList
	public void addByArrayList(String name){

		 arrayList.add("mouse");
		 arrayList.add("computer");
		 arrayList.add("coffe");
		 //System.out.println("the array list is " + name);
			
	}
	//Retrieve data and return the ArrayList
	public ArrayList<String> returnByArrayList(String name){
		  Iterator itr= arrayList.iterator();  
		  	while(itr.hasNext()){  
		  		System.out.println(itr.next());  
		  }
		  	System.out.println("the array list is " + name);
		  		return arrayList;
				
	}
	//add data into the Stack
	public void addByStack(String name){

		
	    stack.push("pc");
	    stack.push("Basket");
	    stack.push("Clone");

	    	System.out.println(stack);
				
	}
	//Retrieve data and return as Stack order
	public Stack<String> returnByStack(String name){
			
			System.out.println(stack.pop());
			return stack;
					
	}
	//add data in Queue order
	public void addByQueue(String name){
		queue.add("Java");
	    queue.add(".NET");

	    queue.add("Javascript");
	    queue.add("HTML5");
	    queue.add("Hadoop");
			 
				
	}
	//Retrieve data and return in Queue order
	public Queue<String> returnByQueue(String name){

        Iterator it=queue.iterator();
		 while(it.hasNext())
	        {
	            String iteratorValue=(String)it.next();
	            System.out.println("Queue  Value is  :"+iteratorValue);
	        }
	return queue;
					
	}
		
}
