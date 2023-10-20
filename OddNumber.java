package d21092023;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);
		System.out.println("enter the starting number");
		int num = input.nextInt();
		
		for (int odd =1; odd<=num; odd++) {
		  if(odd%2 == 1) 
		  {
			 System.out.print(odd+ ",");
			
		  }

	}
	}}

