package d21092023;

import java.util.Scanner;

public class PrintingNaturalNumbersInReverse {

	public static void main(String[] args) {
	 
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the limit number");
		
		int limit = input.nextInt();
		
		for(int starting =limit; starting>=1; starting--) {
			System.out.println(starting);
		}
		
	}

}
