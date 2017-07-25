package set_4;

import java.util.Scanner;

public class EvenQueue {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner (System.in);
System.out.println("Enter the Array size");        //array size is 10
int size=sc.nextInt();
System.out.println("Enter the array elements");    //1 2 3 4 5 6 7 8 9 10
int array[]=new int[size];
for(int i=0;i<array.length;i++){
	array[i]=sc.nextInt();
}
int arr[]=new int[(size)/2];

for(int j=0;j<array.length;j++){
	if((j%2)==0){
		arr[count]=array[j];
		count++;
	}
}
for(int j=0;j<arr.length;j=j+6){
	System.out.println(arr[j]);                    //1
}
sc.close();
	}

}
