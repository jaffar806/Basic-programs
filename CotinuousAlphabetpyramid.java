package patterns2;

public class CotinuousAlphabetpyramid {

	

	public static void main(String[] args) {
		int tem = 65 ;
		for(char i= 0; i<=5; i++) {
			for (char j=0; j<=i; j++) {
				
				System.out.print((char)tem + " ");
				tem++;
				
				
			}System.out.println( );
		}
	}

}
