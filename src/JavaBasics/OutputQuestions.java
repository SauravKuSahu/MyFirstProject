package JavaBasics;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class OutputQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputQuestions.array();
		
		ArrayList<Integer> arrayOfNumbers= new ArrayList<Integer>();
		arrayOfNumbers.add(5);
		arrayOfNumbers.add(8);
		arrayOfNumbers.add(10);
		arrayOfNumbers.add(2);
		arrayOfNumbers.add(17);
		
		int sizeOfList= arrayOfNumbers.size();
		//System.out.println(sizeOfList);
		
		

	}
	
	public static void array() {
		
		int[] a= {2,3,5,7,88,10};
		int sizeofArray= a.length;
		//System.out.println(sizeofArray);
		a[2]=8;
		//System.out.println(a[2]);
		//System.out.println(a[3]);
		
		//===================================
		DecimalFormat format = new DecimalFormat("#.##");
		double newValue = Double.valueOf(format.format(41251.512345663));
		//System.out.println(newValue);
		
		//======Check if the string is Digit or not
		String s= "1234English4446"; //output= hsilg  
		String upperCaseS= s.toUpperCase();
		char[] chArray= upperCaseS.toCharArray();

		int lengthOfString= chArray.length;
		String rev="";

		for (int i=lengthOfString-1; i>=0; i--){
		 if (!Character.isDigit(chArray[i]))
		{
			rev= rev+chArray[i];
		}
		}
		System.out.println("reversed String :" +rev);	

	}
	
		

}
