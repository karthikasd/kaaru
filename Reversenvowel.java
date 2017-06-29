package guvi_string1;

import java.util.Scanner;

public class Reversenvowel {

	public static void main(String[] args) {
String s;
String s1;
String s2;
Scanner sc=new Scanner(System.in);
s=sc.next();
s1=new StringBuilder(s).reverse().toString();
System.out.println(s1);
s2=s.replaceAll("[aeiouAEIOU]","");
System.out.println(s2);
sc.close();
	}

}
