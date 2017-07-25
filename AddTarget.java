package set_3;

import java.util.Scanner;

public class AddTarget {

	public static void main(String[] args) {
		int i,j,k;
		int ans=0;
		System.out.println("Enter the total no.of.arrays");
Scanner sc=new Scanner (System.in);
int element=sc.nextInt();
System.out.println("Enter the araay elements");
int array[]=new int[element];
for(i=0;i<element;i++){
	array[i]=sc.nextInt();
	}
System.out.println("Enter the target number");
int target=sc.nextInt();
for(j=0;j<array.length-1;j++){
	for(k=j+1;k<array.length;k++){
		ans=array[j]+array[k];
if(ans==target){
System.out.println(array[j]+","+array[k]);
}
	}
}
sc.close();
	}

}
