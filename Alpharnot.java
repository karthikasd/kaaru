package guvi;
import java.util.Scanner;
public class Alpharnot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char value=sc.next(".").charAt(0);
		int alpa=(int)value;
		if((alpa>=65&&alpa<=90)||(alpa>=97&&alpa<=122)){
			System.out.println("is alpa");
	}
		else{
			System.out.println("Not a alpha");
		}
sc.close();
}
}