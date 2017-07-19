package string_9;

import java.util.Scanner;

public class WithoutModulo {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if((a/2)*2==a){
	System.out.println("even");
}
else{
	System.out.println("odd");
}
sc.close();
	}

}
