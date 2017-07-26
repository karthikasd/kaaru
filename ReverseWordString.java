package set_8;

import java.util.Scanner;

public class ReverseWordString {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String given=sc.nextLine();
String reverse = null;
String []split=given.split(" ");
for(int i=0;i<split.length;i++){
reverse=new StringBuffer(split[i]).reverse().toString();
System.out.print(reverse+" ");
}
sc.close();
}
}
