package set_2;

import java.util.Scanner;

public class ReverseOrderOfString {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
sc.close();
String []split=str.split(" ");
//String answer=" ";
for(int i=split.length-1;i>=0;i--)
	//StringBuffer buff=new StringBuffer(split[i]);
	//answer+=buff.reverse().toString()+" ";
	       
System.out.print(split[i]+" ");
	}

}
