package string_7;

import java.util.Scanner;

public class Bin2Deci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String binary=sc.nextLine();
		System.out.println(Integer.parseInt(binary,2));
		sc.close();
	}

}
