package loop;

import java.util.Scanner;

public class UsingTerinaryOperator {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("enter the letter");
		
	    char ch =s.next().charAt(0);
		boolean vowel= (ch == 'a'  ||ch =='e'  ||ch =='i'||ch=='o'||ch=='u' )?true : false;
         System.out.println(vowel);
         if (vowel==true) {
        	 System.out.println("letter is vowel");
        	 
         }else {
        	 System.out.println("letter is not vowek");
         }
	}

}
