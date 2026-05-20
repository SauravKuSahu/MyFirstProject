package numberCoding;

public class ReverseANumberPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number= 56432;
		int revnum=0;
		
		while(number>0) {
			revnum=revnum*10+number%10;
			number=number/10;
		}
		
		System.out.println(revnum);	
		}

	}

