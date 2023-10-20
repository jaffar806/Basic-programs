package d21092023;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);
		System.out.println("enter the starting number");
		int num = input.nextInt();
		
		int sum =0;
		
		for (int odd =1; odd<=num; odd++) {
		  if(odd%2 == 1) 
		  {
			 sum = sum +odd;
			
		  }
        
	}System.out.println("sum of odd in between 1 to " +num+ " is : " +sum);

	}}
