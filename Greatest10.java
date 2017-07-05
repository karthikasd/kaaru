package guvi_string4;

import java.util.Scanner;

public class Greatest10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=sc.nextInt();
		int g=sc.nextInt();
		int h=sc.nextInt();
		int i=sc.nextInt();
		int j=sc.nextInt();
		if(a>b&&a>c&&a>d&&a>e&&a>f&&a>g&&a>h&&a>i&&a>j){
			System.out.println("The greatest is "+a);
		}
		else if(b>a&&b>c&&b>d&&b>e&&b>f&&b>g&&b>h&&b>i&&b>j){
			System.out.println("The greatest is "+b);
		}
			else if(c>a&&c>b&&c>d&&c>e&&c>f&&c>g&&c>h&&c>i&&c>j){
				System.out.println("The greatest is "+c);
			}
				else if(d>a&&d>b&&d>c&&d>e&&d>f&&d>g&&d>h&&d>i&&d>j){
					System.out.println("The greatest is "+d);
				}
					else if(e>a&&e>b&&e>c&&e>d&&e>f&&e>g&&e>h&&e>i&&e>j){
						System.out.println("The greatest is "+e);
					}
						else if(f>a&&f>b&&f>c&&f>d&&f>e&&f>g&&f>h&&f>i&&f>j){
								System.out.println("The greatest is "+f);
						}
							else if(g>a&&g>b&&g>c&&g>d&&g>e&&g>f&&g>h&&g>i&&g>j){
									System.out.println("The greatest is "+g);
								}
								else if(h>a&&h>b&&h>c&&h>d&&h>e&&h>f&&h>g&&h>i&&h>j){
										System.out.println("The greatest is "+h);
									}
									else if(i>a&&i>b&&i>c&&i>d&&i>e&&i>f&&i>g&&i>h&&i>j){
										     System.out.println("The greatest is "+i);
									}
										
		else{
			System.out.println("The greatest is "+j);
		}
		sc.close();
	}

}
