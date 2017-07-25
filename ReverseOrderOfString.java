package set_2;

import java.util.Scanner;

public class ReverseOrderOfString {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
sc.close();
String []split=str.split(" ");
for(int i=split.length-1;i>=0;i--)
	       System.out.print(split[i]+" ");
	}
}
