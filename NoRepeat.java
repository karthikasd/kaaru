package set_1;

import java.util.Scanner;

public class NoRepeat {

	public static void main(String[] args) {
int i,j;
int count;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array length:");
int length=sc.nextInt();
System.out.println("Enter the Elements:");
int a[]=new int [length];
for(i=0;i<length;i++){
	a[i]=sc.nextInt();
	}
	for(i=0;i<a.length;i++){
		count=0;
	for(j=0;j<a.length;j++){
	if(j!=i && a[i]==a[j])
		count++;
}
if(count==0)
	System.out.println(a[i]);
}	
sc.close();
}
}