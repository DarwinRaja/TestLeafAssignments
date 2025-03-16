package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String text1 = "stops", text2 = "potss";
			if((text1.length())!=(text2.length())) {
				System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			}
			else {
				char a[] = text1.toCharArray();
				char b[] = text2.toCharArray();
				Arrays.sort(a);
				Arrays.sort(b);
				for (int i = 0; i < a.length; i++) {
					if (a[i]==b[i] && i == a.length-1) {
						System.out.println("The given strings are Anagram.");
					}
					else if (a[i]==b[i]) {
						continue;
					}
					else
						System.out.println("The given strings are not an Anagram.");
					    break;		
				}
			}
	}

}
