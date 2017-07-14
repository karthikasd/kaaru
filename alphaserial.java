package String_11;
import java.util.Scanner;
public class alphaserial {

	public static void main(String[] args) {
String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
System.out.println(alpha.substring(num-1,num));
sc.close();
	}

}
