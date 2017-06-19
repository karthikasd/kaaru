package guvi_string;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
int a;
int fact=1;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
for(int i=1;i<=a;i++){
	fact=fact*i;
}
System.out.println(fact);
sc.close();
	}

}
