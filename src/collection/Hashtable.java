package collection;
import java.util.Hashtable;
import Java.util.Map;

//Stores Data in Key-Value Pair
//keys should be unique
//Values can be duplicate
//Diff types of Elements can be stored in key position
//key cant be null and also Cant store Null in Hashtable. Whereas hashMap can have one Null Key and can store any number of null values 
//doesnt follow insertion/sorting order
//synchronized data structure

public class Hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Not sure why the Jdk is not automatically impoirting Hashtable
		
		Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(101, "John");
        ht.put(102, "David");
        ht.put(103, "Sam");

        for (Map.Entry<Integer, String> entry : ht.entrySet()) {
            System.out.println(
                entry.getKey() + " -> " + entry.getValue()
            );
		

	}

}
