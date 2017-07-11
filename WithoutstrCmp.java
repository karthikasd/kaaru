package set5;

import java.util.Scanner;

public class WithoutstrCmp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.length()==s2.length()){
			System.out.println("true");
		}
		else{
			System.out.println("False");
		}
		sc.close();
			}

}
