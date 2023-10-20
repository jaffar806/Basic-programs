package d21092023;

import java.util.Scanner;

public class PrintingAlphabets {

	public static void main(String[] args) {
		Scanner alphabet =new Scanner(System.in);
		System.out.println("Enter the Alphabet ");
		char input = alphabet.next().charAt(0);  //this will take the alphabet input from cosole
		char end='z';
		for(char starting =input; starting<=end; starting++) {
		System.out.print(starting+  " ");	
		
		}

	}

}
