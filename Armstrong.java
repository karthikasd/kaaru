package guvi;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
int a;
int b=0;
int c=0;
Scanner sc=new Scanner (System.in);
a=sc.nextInt();
int temp=a;
while(a>0){
	b=a%10;
	a=a/10;
	c=c+(b*b*b);
}
if(temp==c){
	System.out.println("Armstrong");
}
else{
	System.out.println("Not a armstrong");
}
sc.close();
	}

}
