package set_14;

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String []ch=str.split(" ");
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]+" ");
		}
sc.close();
}
}
