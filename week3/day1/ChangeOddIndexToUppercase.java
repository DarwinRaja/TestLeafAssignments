package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char s[] = test.toCharArray();
		// Since in requirement its mentioned to have loop from end to start
		for (int i = test.length()-1; i >= 0; i--) {
			if (i%2!=0) {
				s[i] = Character.toUpperCase(s[i]);
			}
		}
		for (int j =0; j < test.length(); j++) 
			System.out.print(s[j]);
	}

}
