package program;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args)
	{
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter a table number");
	  int tableNumber = s.nextInt();
	  System.out.println("This is your " +tableNumber+ " table");
	  
	  for (int i=1; i<=10 ;i++)
	  {
		  System.out.println(tableNumber+ "*" +i+ "=" +tableNumber*i);
	  }
	  

	}

}
