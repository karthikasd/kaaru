package guvi_string1;

import java.util.Scanner;

public class IpAddress {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int a=sc.nextInt();
		String s=sc.nextLine();
		if(s.length()==11){
			System.out.println((s.substring(0,3))+"."+(s.substring(3,6))+"."+(s.substring(6,9))+"."+(s.substring(9,s.length()))); 
		}
	sc.close();
	}

}
