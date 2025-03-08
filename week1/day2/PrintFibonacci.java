package week1.day2;

public class PrintFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int range = 8, a = 0, b = 1;
			for (int i = 1; i <= range; i++) {
				if (i!=range) {
					System.out.print(a+", ");
					int c = a+b;
					a=b;
					b=c;
				}
				else {
					System.out.print(a);
				}
			}
	}
}
