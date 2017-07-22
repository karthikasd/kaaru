package set_1;
import java.util.Scanner;
class NoRepeating {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array size");
int a=sc.nextInt();
System.out.println("Enter the array element");
int aa[]=new int[a];
int bb[]=new int[aa.length];
for(int i=0;i<a;i++){
	aa[i]=sc.nextInt();
	}
for(int i=0;i<aa.length;i++){
	for(int j=0;j<aa.length;j++){
		if(aa[i]==aa[j]){
			bb[i]++;
		}
	}
}
for(int i=0;i<aa.length;i++){
if(bb[i]==1){
	System.out.println(aa[i]);
}
}
sc.close();
}
}