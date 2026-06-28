package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//In Java Collection Framework, LinkedList is a class that implements both the List and Deque interfaces.
//ArrayList is better for frequent retrieval (get(index)), whereas LinkedList is better for frequent insertion and deletion operations.
//underlying data struture is doubly linked list - stores address of previous and next node address
//can traverse forwad and backward. Can store multiple data types and allows duplicate, null values.
//Non Synchronized and non Thread Safe
//List.add(index, Data) and List.get (index)

public class LinkedListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LinkedList<String> list = new LinkedList<>();

	        list.add("Java");
	        list.add("Selenium");
	        list.add("Guidewire");

	        list.addFirst("TestNG");
	        list.addLast("Maven");

	        System.out.println(list);

	        System.out.println("First Element: " + list.getFirst());
	        System.out.println("Last Element: " + list.getLast());

	        list.removeFirst();
	        list.removeLast();

	        System.out.println("After Removal: " + list);
	        
	        System.out.println("=== Iterate Linked list ===");
	        for(String item : list) {
	            System.out.println(item);
	        }
	        
	        
	        System.out.println("=== Iterate Linked list Previous and Forwad ===");
	        ListIterator<String> itr = list.listIterator();

	        // Forward Traversal
	        System.out.println("Forward Traversal:");
	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }

	        // Backward Traversal
	        System.out.println("Backward Traversal:");
	        while (itr.hasPrevious()) {
	            System.out.println(itr.previous());
	        }
					
	}

}
