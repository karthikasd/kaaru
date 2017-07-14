package String_11;

import java.util.Scanner;

public class AddWithoutOperator {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
for(int i=b;i>0;i--){
	a++;
}
System.out.println(a);
sc.close();
	}

}
