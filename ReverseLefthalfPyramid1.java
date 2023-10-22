package patterns2;

import java.util.Scanner;

public class ReverseLefthalfPyramid1 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the number");
		int num = s.nextInt();
		
		for (int row =1; row<=num; row++) {
			for(int space=2; space<=row; space++) 
			{
				System.out.print(" ");
			}
			for(int column=row; column<=num; column++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
