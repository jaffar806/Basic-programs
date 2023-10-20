package d21092023;

import java.util.Scanner;

public class AllEvenNumbers {


		public static void main(String[] args) {
			Scanner input = new  Scanner(System.in);
			System.out.println("enter the starting number");
			int num = input.nextInt();
			
			for (int evennum =1; evennum<=num; evennum++) {
			  if(evennum%2 == 0) 
			  {
				 System.out.println(evennum);
				
			  }
			}}}

	


