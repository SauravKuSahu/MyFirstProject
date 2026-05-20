package stringCoding;

public class ReverseAStringPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1= "Work hard to get Success";
		String S2="";
		
		/*
		 * int len= S1.length(); for (int i=len-1; i>=0; i--) { S2=S2+ S1.charAt(i); }
		 * System.out.println("String After reverse:");
		 */     
     
		String[] arr= S1.split(" ");
		int len= arr.length;
		
		for(int i=len-1; i>=0; i--) {
			System.out.print (arr[i] + " ");
		}
	}	
}
		

