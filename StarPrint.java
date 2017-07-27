package set_14;

import java.util.Scanner;

public class StarPrint {
public static void main(String [] args){
	int i,j,k;
	Scanner sc=new Scanner(System.in);
	int star=sc.nextInt();
	for(i=0;i<star;i++){  
		for(j=0;j<2;j++){
		for(k=i;k<star;k++){
			System.out.print("*");
		}
		System.out.print(" ");
		}
		System.out.println();
}	
	sc.close();
}
}
