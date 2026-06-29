package collection;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array is static in nature. Array is a data structure that stores multiple data of same type.
		//Stores data of same data type. upper index is 0.
		
		int[] arr= new int[5]; 
		arr[0]= 1;
		arr[4]= 4;
		System.out.println(arr.length);
		//System.out.println(arr[5]);  //ArrayIndexOutOfBoundsException
		
		int[] arr2 = {10,20,30,40,50};
		
		//Print all values of Array
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			System.out.println(arr2[i]);
		}
		
			

	}

}
