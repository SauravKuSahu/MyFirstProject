package JavaBasics;

import java.util.Scanner;

public class NumberGames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		NumberGames num = new NumberGames();

		// num.sum(a, b);
		// num.swapUsingVariable(a, b);
		// num.swapWithoutUsingVariable(a, b);
		// num.factorialOfANumber();
		// num.checkEven();
		// fibonacci();
		num.checkArmstrong(155);
		//num.checkPallendrome(122);

	}

	public void sum(int a, int b) {
		int add = a = b;
		System.out.println(add);
	}

	public void swapUsingVariable(int num1, int num2) {
		System.out.println("Numbers before swap: Num1=" + num1 + " and Num2=" + num2);
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.println("Numbers after swap: Num1=" + num1 + " and Num 2=" + num2);
	}

	public void swapWithoutUsingVariable(int no1, int no2) {
		System.out.println("Numbers before swap: Num1=" + no1 + " and Num2=" + no2);
		no1 = no1 + no2;
		no2 = no1 - no2;
		no1 = no1 - no2;
		System.out.println("Numbers after swap: Num1=" + no1 + " and Num 2=" + no2);
	}

	public void factorialOfANumber() {

		try {
			Scanner input = new Scanner(System.in);
			System.out.println("enter a number to generate its factorial");
			int number = input.nextInt(); // 10

			if (number > 0) {
				int i, fact = 1;
				for (i = 1; i <= number; i++) {
					fact = fact * i;
				}
				System.out.println("Factorial of " + number + " is:" + fact);
			} else {
				System.out.println("Entered number is Invalid");
			}

		} catch (Exception e) {

			System.out.println("Please enter valid Integer Number and try again");
		}
	}

	private void checkEven() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number to check if its even or not");
		int number = input.nextInt(); // 10
		while (number > 0) {
			if (number % 2 == 0) {
				System.out.println("Entered No " + number + " is Even");
			} else {
				System.out.println("Entered No " + number + " is Odd");
			}
			break;
		}

	}
	
	private void checkPallendrome(int n) {
		int rem=0;
		int num=0;
		int temp=n;
		while (n>0) {
			rem=n%10;
			num= num*10+rem;
			n=n/10;
		}
		
		if (temp==num) {
			System.out.println("The Number is pallendrome");
		}
		else {
			System.out.println("The Number is not pallendrome");
		}
	}
	
	private void checkArmstrong(int n) {
		int rem=0;
		int num=0;
		int temp=n;
		while (n>0) {
			rem=n%10;
			num = rem*rem*rem + num;
			n=n/10;
		}
		
		if (temp==num) {
			System.out.println("The Number is armstrong");
		}
		else {
			System.out.println("The Number is not armstrong");
		}
	}

}
