package JavaBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection collection = new Collection();
		// collection.IterateArraylist();
		collection.IterateMap();

	}

	public void IterateArraylist() {
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Saurav");
		studentList.add("Sandeep");
		studentList.add("Girija");
		studentList.add("Asit");

		// Iterate through For Loop
		System.out.println("-----Iterate Arraylist using Typical For Loop---------");
		int sizeOfList = studentList.size();
		for (int i = 0; i <= sizeOfList - 1; i++) {
			System.out.println(studentList.get(i));
		}
		// Iterate through For Each Loop
		System.out.println("-----Iterate Arraylist using For Each Loop---------");
		for (String s : studentList) {
			System.out.println(s);
		}
	}

	public void IterateMap() {
		// TODO Auto-generated method stub
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
		studentMap.put(100, "Saurav");
		studentMap.put(101, "Sandeep");
		studentMap.put(102, "Girija");
		studentMap.put(103, "Asit");

		// Iterate through keyset
		System.out.println("Iterate through Key Set");
		Iterator<Integer> it = studentMap.keySet().iterator();
		while (it.hasNext()) {
			int key = it.next();
			String value = studentMap.get(key);
			System.out.println("Student ID : " + key + " and Name : " + value);
		}

		// Iterate using Set pair (or) Entry Set
		System.out.println("Iterate through Entry Set");
		Iterator<Entry<Integer, String>> it1 = studentMap.entrySet().iterator();
		while (it1.hasNext()) {
			Entry<Integer, String> entry = it1.next();
			System.out.println("Student ID : " + entry.getKey() + " and Name : " + entry.getValue());
		}

	}
}
