package guvi;

import java.util.Scanner;

public class Posnegzero {

	public static void main(String[] args) {
		int integer;
		System.out.println("Enter the integer");
		Scanner number=new Scanner(System.in);
		integer=number.nextInt();
		if(integer>0){
			System.out.println("positive");
		}
		else if(integer<0){
			System.out.println("Negative");
		}
		else{
			System.out.println("zero");
		}
		number.close();
	}

}
