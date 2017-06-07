package guvi;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
System.out.println("Enter the integer");
Scanner number=new Scanner(System.in);
int integer=number.nextInt();
if(integer%2==0){
	System.out.println("Even");
}
else{
	System.out.println("Odd");
}
number.close();
	}
}


