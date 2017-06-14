package guvi;

import java.util.Scanner;

public class Eveninrange {

	public static void main(String[] args) {
int a;
int b;
Scanner sc=new Scanner (System.in);
a=sc.nextInt();
b=sc.nextInt();
for(int i=a;i<=b;i++){
	if(i%2==0){
		System.out.println(i);
	}
}
sc.close();
	}

}
