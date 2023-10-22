package patterns2;

import java.util.Scanner;

public class RightHalfPyramid1 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the number");
		int num = s.nextInt();
		
		
		for (int row =1; row<=num; row++) { //it is outer row 
			for(int column=1; column<=row; column++) { //1:* printing 1 time 
				System.out.print("* ");
			}System.out.println();
		}

	}

}
