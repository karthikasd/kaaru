package set_9;

import java.util.Scanner;

public class Lexico {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str[]={sc.next(),sc.next()};
if(str[0].compareTo(str[1])<0){
	System.out.println("lexicograph");
}
else if(str[0].compareTo(str[1])==0){
	System.out.println("Equivalent");
}
else if(str[0].compareTo(str[1])>0){
	System.out.println("Not a lexicograph");
}
sc.close();
}
}
