package week1.day2;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int input = 121, output = 0;
			if (input < 0) {
				System.out.println(input+" is not a Palindrome number");
			}
			else {
				for (int i = input; i > 0;) {
					int rem=i%10;
					output=(output*10)+rem;
					i=i/10;
				}
				if (input==output) {
					System.out.println(input+" is a Palindrome number");
				}
				else {
					System.out.println(input+" is not a Palindrome number");
				}
			}
	}

}
