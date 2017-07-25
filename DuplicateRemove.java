package set_3;

import java.util.Scanner;

public class DuplicateRemove {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
sc.close();
String r="";
for(int i=0;i<str.length();i++){
	//if(!r.contains(""+str.charAt(i))){
	//r=r+str.charAt(i);
	if(r.contains(str.charAt(i)+"")){                                              
	}
	else{
		r+=str.charAt(i);
	}
		      }
	//}
System.out.println(r);
	}
}
