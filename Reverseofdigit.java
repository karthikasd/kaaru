package guvi_string;
import java.util.Scanner;
public class Reverseofdigit {

	public static void main(String[] args) {
int a;
int n=0;

		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		while(a!=0){
			n=(n*10)+(a%10);
			a=a/10;
		}
		System.out.println(n);
		sc.close();
	}
}

