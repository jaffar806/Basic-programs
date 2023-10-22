package patterns2;

import java.util.Scanner;

public class LeftHalfPyramid1 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the number");
		int num = s.nextInt();
		
		for (int row =1; row<=num; row++) {
			for(int space=row; space<num; space++) {
				System.out.print(" ");
			}
			for(int column=1; column<=row; column++) {
				System.out.print("*");
			}System.out.println();
		}

	}

}
