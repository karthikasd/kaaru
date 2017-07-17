 package string_9;

public class Isogram {

	public static void main(String[] args) {
String str="letter";
int iso=0;
for(int i=0;i<=str.length()-1;i++)
	for(int j=i+1;j<=str.length()-1;j++)
		if(str.charAt(i)==str.charAt(j))
			iso=1;                       
if(iso==1){
	System.out.println("not a isogram");
}
else{
	System.out.println("Isogram");
}
	}
}
