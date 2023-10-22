package loop;

import java.util.Scanner;

public class SwitchCaseToFindAlphabet {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the letter");
		
	    char ch =s.next().charAt(0);
	    
	    if(!Character.isAlphabetic(ch))
	    	
	    {
	    	System.out.println("it is not a Alphabet");
	    	return;
	    }
	    boolean vowel = false;
	    switch(ch) {
	    case 'a' :
	    case 'e':
	    case 'i':
	    case 'o':
	    case'u':
	    	vowel = true;

	 }if ( vowel) {
		 System.out.println("it is vowel");
		 
	 }else {
		 System.out.println("it is not a vowel");
	 }
	}

}
