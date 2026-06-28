package collection;
import java.util.LinkedHashSet;

//Uses AllSet Concepts
//maintains insertion order
//Data Structure is Hash Table and LinkedList
//cant do reverse iteration which is possible in linkedList

public class LinkedHashSetConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> cities = new LinkedHashSet<>();

        // Adding elements
        cities.add("Bangalore");
        cities.add("Hyderabad");
        cities.add("Pune");
        cities.add("Chennai");
        cities.add("Bangalore"); // Duplicate, won't be added

        // Displaying elements
        System.out.println("Cities: " + cities);

        // Iterating through LinkedHashSet
        for(String city : cities) {
            System.out.println(city);
        }

	}

}
