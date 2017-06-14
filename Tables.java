package guvi;
import java.util.Scanner;
public class Tables {

	public static void main(String[] args) {
int b;
int tab=1;
Scanner sc=new Scanner(System.in);

b=sc.nextInt();
			for(int i=1;i<=b;i++){
		tab=i*b;
			System.out.println(i+ "*" +b+"="+tab);
		}
			sc.close();
	}
	}

