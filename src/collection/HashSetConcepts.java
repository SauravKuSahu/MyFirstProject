package collection;
import java.util.HashSet;


//Set Concepts
//Stores unique elements (no duplicates).
//Does not maintain insertion order. Doesn't maintain any order
//Allows one null value.
//Cant iterate through indexation like get(Index) as it doesnt maintain indextaion.
//can iterate through Iterator or enhanced for loop

//uses Hash Table as data structure. Hashset is backed up my Map.

public class HashSetConcepts {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicate, won't be added

        System.out.println(fruits);
        
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

	}

}
