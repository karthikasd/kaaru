package guvi;

import java.util.Scanner;

public class Vowelconso {

	public static void main(String[] args) {
System.out.println("Enter the letter");
Scanner word=new Scanner(System.in);
char ch=word.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
	System.out.println("vowel");
}
else{
	System.out.println("consonant");
}
	word.close();

	}

}
