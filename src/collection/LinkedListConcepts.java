package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll= new LinkedList();
		ll.add("Saurav");
		ll.add("Kumar");
		ll.add("Sahu");
		
		System.out.println(ll);
		
		//1. For Loop Iteration
		for (int i=0; i<ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		
		System.out.println();
		
		//2. Using Iterator
		Iterator it= ll.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
					
	}

}
