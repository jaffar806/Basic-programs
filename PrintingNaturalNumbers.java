package d21092023;

import java.util.Scanner;

public class PrintingNaturalNumbers {
 //printing natural numbers between starting number to ending number
	
	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);
		System.out.println("enter the starting number");
		int startnum = input.nextInt();
		System.out.println("Enter the ending number");
		int endingnum = input.nextInt();
		
		
		System.out.println("natural numbers are:");
		for (startnum = startnum
				; startnum<=endingnum; startnum++) {
			;
			System.out.println(startnum);
		}
		
		
	}

}
