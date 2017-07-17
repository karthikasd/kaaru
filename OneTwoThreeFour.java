package string_8;

import java.util.Scanner;

public class OneTwoThreeFour {

	public static void main(String[] args){
				Scanner sc=new Scanner(System.in);
		String give=sc.next();
		int len=give.length();
				int a=0,c=0;
		int given=Integer.parseInt(give);
		while(given!=0){
			a=given%10;
			int b=1;
			for(int i=1;i<=len;i++){
				b=b*a;
							}
		c=c+b;
						given=given/10;
		}
		System.out.println(c);
		
		
	
sc.close();
}
}
