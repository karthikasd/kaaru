package guvi_string4;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
int i;
		Scanner sc=new Scanner(System.in);
 int size=sc.nextInt();
int[]a=new int[size];
a[0]=0;
a[1]=1;
for(i=2;i<size;i++){
	a[i]=a[i-1]+a[i-2];
	}
for( i=0;i<size;i++){
System.out.print(a[i]+" ");
}
sc.close();
	}
}

