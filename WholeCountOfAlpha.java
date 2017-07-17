package string_9;
import java.util.Scanner;
public class WholeCountOfAlpha {
	public static void main(String[] args) {
		 String input;
			Scanner sc=new Scanner(System.in);
			input=sc.nextLine();
		        int count=0;
			for(int i=1;i<input.length();i++)
		            if(Character.isLetter(input.charAt(i)))
		                count++;
		        System.out.print(count);
		      sc.close();	
	}
}
