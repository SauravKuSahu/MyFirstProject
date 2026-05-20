package JavaBasics;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {12, 15, 14, 13, 8, 9, 10, 8, 11, 20};

		int size = arr.length; //10
		int count= 0;

		for (int i=0; i< size; i++){
		 	if (arr[i] % 2== 0)
		{
		count= count +1 ; 
		}
		}

		 System.out.println("From the given Array " +count+ " numbers are divisibe by 2");
		}

}
