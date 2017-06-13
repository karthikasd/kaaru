package guvi;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		int a;
		int b;
		int power=1;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
for(int i=1;i<=b;i++){
	power=power*a;
}
System.out.println(power);
sc.close();
	}

}
