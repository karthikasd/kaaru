package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
		int i=0;
Scanner sc=new Scanner (System.in);
int x=sc.nextInt();
int y[]=new int[6];
while(x!=0){
y[i]=x%10;
x=x/10;
i++;
}
Arrays.sort(y,0,y.length-1);

System.out.println(y[0]*10+y[1]);
sc.close();
	}
}

