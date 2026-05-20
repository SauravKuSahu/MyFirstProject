package JavaBasics;

import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringFunctions sf = new StringFunctions();
		String str = "Saurav Sahu works as test Analyst";
		sf.reverseString(str);
		// String dupstr = "Big black bug bit a big black dog on his big black nose";
		// sf.findDuplicateWords(dupstr);
		sf.checkAnagram("SIGN", "SING");

	}

	public void reverseString(String str) {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter a String which needs to be Reversed");
		// String str = sc.next();
		String revstr = "";
		char[] ch = str.toCharArray();  //str.charAt[i]
		for (int i = ch.length - 1; i >= 0; i--) {
			revstr += ch[i];
		}
		System.out.println("String after Reverse: " + revstr);

	}

	private void findDuplicateWords(String dupstr) {
		String words[] = dupstr.split(" ");
//"Big black bug bit a big black dog on his big black nose"
		for (int i = 0; i <= words.length - 1; i++) {
			int noOfAWrd = 1;
			for (int j = i + 1; j <= words.length - 1; j++) {
				if (words[i].equalsIgnoreCase(words[j])) {
					noOfAWrd += 1;
					words[j] = "0";
				}
			}
			if (words[i] != "0")
				System.out.println("word " + words[i] + " is present " + noOfAWrd + " times in the given statement");
		}

	}

	private void checkAnagram(String s1, String s2) {
		char[] letterofs1 = s1.toCharArray();
		char[] letterOfs2 = s2.toCharArray();

		int count1 = letterofs1.length;
		int count2 = letterOfs2.length;
		if (count1 != count2) {
			System.out.println("Entered Strings are not Anagram");
		} else {
			int countofletter = 0;
			for (int i = 0; i < count1; i++) {
				for (int j = 0; j < count2; j++) {
					if (letterofs1[i] == letterOfs2[j]) {
						countofletter += 1;
					}
				}
			}

			if (countofletter == count1) {
				System.out.println("Entered Strings are Anagram");
			} else {
				System.out.println("Entered Strings are not Anagram");
			}
		}
	}

}
