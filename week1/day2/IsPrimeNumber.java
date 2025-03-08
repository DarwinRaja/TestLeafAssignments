package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n = 13;
			boolean check = true;
			if (n==0||n==1)
			{
				System.out.println(n+" "+"is a non-prime number");
			}
			else {
				for (int i = 2; i <=n-1; i++) {
					if (n%i==0) {
						System.out.println(n+" "+"is a non-prime number");
						check = false;
						break;
						}
					}
				if (check == true) {
					System.out.println(n+" "+"is a Prime number");
				}
			}
			
		}
}
