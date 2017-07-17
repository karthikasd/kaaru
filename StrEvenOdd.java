package string_9;

public class StrEvenOdd {

	public static void main(String[] args) {
String str="program";
String ch1="";
String ch2="";
for(int i=0;i<=str.length()-1;i++){
	if((i==0) || (i%2==0)){
		ch1=ch1+str.charAt(i);
	}
	if(i%2!=0){
		ch2=ch2+str.charAt(i);
	}
	}
System.out.println(ch1+ch2);
}
}