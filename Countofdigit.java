package guvi;

import java.util.Scanner;

public class Countofdigit {

	public static void main(String[] args) {
int a,count=0;
System.out.println("ENter the numbers");
Scanner number=new Scanner(System.in);
a=number.nextInt();
while(a!=0){
	a=a/10;
	++count;
}
System.out.println(+count);
number.close();
}
	
	}


