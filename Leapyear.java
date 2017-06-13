package guvi;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if((a%400==0)||(a%4==0)&&(a%100!=0)){
	System.out.println(a+ "is a leap year");
}
else{
	System.out.println(a+ "not a leap year");
}
sc.close();

	}

}
