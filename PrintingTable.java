package d21092023;

import java.util.Scanner;

public class PrintingTable {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the table number: ");
		int table = input.nextInt();
		
		for (int constant =1; constant<=10; constant++)
            System.out.println(table+ "*"  +constant+  "="  +(table*constant));
			
	}

}
