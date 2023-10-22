package patterns2;

import java.util.Scanner;

public class NumberIncreasingPyramid {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the number");
		int num = s.nextInt();
		
		for (int row=1; row<=num; row++) {
			for(int column=1; column<=row; column++) {
				System.out.print(column);
			}System.out.println();
		}

	}

}
