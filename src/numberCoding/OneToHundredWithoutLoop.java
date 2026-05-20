package numberCoding;

public class OneToHundredWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNum(1);
	}
		
	public static void printNum(int x){
	if (x<=100) {
	System.out.println(x);
	x++;
	printNum(x);
	}
}

}

