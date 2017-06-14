package guvi;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
int a;
int r;
int n=0;
int temp;
Scanner sc =new Scanner(System.in);
a=sc.nextInt();
temp=a;
while(a>0){
	r=a%10;
	n=n*10+r;
	a=a/10;
	}
if(temp==n){
	System.out.println("palindrome");
}
else{
	System.out.println("not a palindrome");
}
sc.close();
}

}
