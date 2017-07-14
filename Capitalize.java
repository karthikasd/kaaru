package String_11;

import java.util.Scanner;

public class Capitalize {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String result=" ";
		char start=input.charAt(0);
		result=result+Character.toUpperCase(start);
				for(int i=1;i<input.length();i++){
			char present=input.charAt(i);
			char previous=input.charAt(i-1);
			if(previous==' '){
				result=result+Character.toUpperCase(present);
							}
			else{
			result=result+present;					
							}
			}
		System.out.println(result);
		sc.close();

}

}


