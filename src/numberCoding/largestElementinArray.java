package numberCoding;

public class largestElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int a[] = {5,15,7,8,10};
		int larNum= a[0];
		int smallNum= a[0];
		
		for (int i=0; i<a.length; i++) {
			if (a[i]>larNum) {
				larNum=a[i];
			}
			else if (a[i]<smallNum) {
				smallNum=a[i];
			}
		}

			System.out.println("largest No:" +larNum);
			System.out.println("Smallest No:" +smallNum);
	}

}
