package string_8;

import java.util.Scanner;

public class MiddleStar {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
if(str.length()%2!=0){
	int middle=str.length()/2;     
	int m1=middle+1;
	StringBuffer sb=new StringBuffer(str);
	sb.replace(middle,m1,"*");
	System.out.println(sb);
}
else{
	System.out.println(str);
}

sc.close();

	}

}
