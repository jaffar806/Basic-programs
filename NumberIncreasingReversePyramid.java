package patterns2;

import java.util.Scanner;

public class NumberIncreasingReversePyramid {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the number");
		int num = s.nextInt();
		
		for (int row=num; row>=1; row--) {
			for(int column=1; column<=row; column++) {
				System.out.print(column);
			}System.out.println();
		}

	}

}
