package program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
	/*
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the factorial number");
		int num = s.nextInt();
		int fact =1;
		for(int i=1; i<=num; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of " +num+ " is " +fact);
		
		-------------------------------------------------------------------------------------------------------
		(using dicriment find factorial)
		*/
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the factorial number");
		int num = s.nextInt();
		int fact =1;
		
		//here we initialize the input num to i then if i>=1 it goes inside loop after coming out from block i will decrease and again loop will continue
		for(int i=num; i>=1; i--)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of " +num+ " is " +fact);

	}

}
