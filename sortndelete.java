package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
		int i=0;
Scanner sc=new Scanner (System.in);
int a=sc.nextInt();
int b[]=new int[6];
while(a!=0){
b[i]=a%10;
a=a/10;
i++;
}
Arrays.sort(b,0,b.length-1);

System.out.println(b[0]*10+b[1]);
sc.close();
	}
}

