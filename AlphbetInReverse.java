package d21092023;

import java.util.Scanner;

public class AlphbetInReverse {

	public static void main(String[] args) {
		Scanner alphabet =new Scanner(System.in);
		System.out.println("Enter the Alphabet ");
		char input = alphabet.next().charAt(0);  //this will take the alphabet input from cosole
		char end='A';
		
		for(char start =input; start>= end; start--) {
            System.out.print(start+ " ");
	}

}}
