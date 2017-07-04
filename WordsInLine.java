package guvi_string4;
import java.util.Scanner;
public class WordsInLine {
	public static void main(String[] args) {
			int count=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String");
			String s=sc.nextLine();
			int a=s.length();
			 char ch[]= new char[a];    
			 for(int i=0;i<a;i++)
			{
			     ch[i]= s.charAt(i);
			     if( ((i==0)&&(ch[0]!=' ')) || ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) )
			        count++;
			 }
			System.out.println("No.of words in String: "+count);
			sc.close();
	}

}
