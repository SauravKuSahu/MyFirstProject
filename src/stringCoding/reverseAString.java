package stringCoding;

public class reverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S= "saurav"; 
//		  int len= S.length(); 
//		  String rev = "";
//		  
//		  for(int i=len-1; i>=0; i--) { rev= rev + S.charAt(i); }
//		  System.out.println("Reverse of String is " + rev);
//	 
		
//2 String Buffer
		
//		StringBuffer sf= new StringBuffer(S);
//		System.out.println(sf.reverse());
		

		// 3. reverse a Sentence (Letter by letter)
		
		String sentence = "Toil hard until the Goal is achieved";
		String rev="";
		int lenOfSen = sentence.length();
		System.out.println("No of Words in the Sentence: "+ lenOfSen);
		for(int i=lenOfSen-1; i>=0; i--) {
			rev=rev+ sentence.charAt(i);
		}
		System.out.println("Reverse of String is " + rev);
		
}
}
