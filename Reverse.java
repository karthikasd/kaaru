package guvi_string;
import java.util.Scanner;

class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word=sc.next();
				String b=new StringBuilder(word).reverse().toString();
		System.out.println(b);	
		sc.close();
	}
}
		
		
		
		
		
