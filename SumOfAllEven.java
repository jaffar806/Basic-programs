package d21092023;

import java.util.Scanner;

public class SumOfAllEven {

	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);
		System.out.println("limit of the even number");
		int num = input.nextInt();
		int sum =0;
		int evennum;
		//it i give the limit of n it will add the even numbers till that limit
		//ex: console:5 --> 1,2,3,4,5 -->it add 2+4=6  because 2 and 4 are even number
		for (evennum =1; evennum<=num; evennum++) 
		{
		  if(evennum%2 == 0) 
		  
			 sum =sum +evennum; 
			
		  
		}
		System.out.println(sum);
		
	} 

	}

