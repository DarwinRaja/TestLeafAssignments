package week3.day1;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] num={2, 5, 7, 7, 5, 9, 2, 3, 9};
		 Arrays.sort(num);
		 System.out.println("Duplicate numbers are:");
		 for (int i=0; i<num.length-1 ;i++) {
			 if (num[i+1]==num[i]) {
				 System.out.println(num[i]);
			 }
		 };
	}

}
