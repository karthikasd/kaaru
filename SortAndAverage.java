package set_8;
import java.util.Arrays;
import java.util.Scanner;
public class SortAndAverage {
public static void main(String[] args) {
		int j,i;
		int sum=0;
		int average=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array size");
int size=sc.nextInt();
System.out.println("Enter the array Elements");
int arrai[]=new int[size];
for(i=0;i<size;i++){
	arrai[i]=sc.nextInt();
}
sc.close();
Arrays.sort(arrai);
//for(j=0;j<arrai.length;j++){//
	for(j=arrai.length-1;j>=0;j--){
	System.out.println(arrai[j]);
	sum+=arrai[j];
		}
System.out.println(sum);
average=sum/size;
System.out.println(average);
	}
}
