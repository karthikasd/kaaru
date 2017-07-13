package string_12;
class Average {
public static String output="";
	public static void main(String[] args) {
		password("reverse");
		System.out.println(output);
	}
public static void password(String input){
	int asci,sum=0;
for(int i=0;i<=input.length()-1;i++){
	char ch=input.charAt(i);
	asci=(int)ch;
	sum=sum+asci;
	}
int avg=sum/input.length();
output=String.valueOf((char)avg);
}
}

