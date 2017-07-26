package set_7;
class IDgenerator {

	public static String output1=" ";
	public static String output2=" ";
public static void main(String[] args) {
  idgeneration("Rajiv","Roy","560037",6);
  System.out.println(output1);
  System.out.println(output2);
	}
public static void idgeneration(String input1,String input2,String input3,int b){
	String longername = null;
	String smallername = null;
		if((input1.length()<(input2.length()))){
		smallername=input1;
		longername=input2;
	}
	else if((input1.length()>(input2.length()))){
		smallername=input2;
		longername=input1;
	}
	else if (input1.length()==input2.length()){
		 for(int i=0;i<input1.length();i++){
		if(!(input1.substring(i,i+1).equals(input2.substring(i,i+1)))){
			 char alpha=input1.charAt(i);
			 char beta=input2.charAt(i);
		if((int)alpha>(int)beta){
			longername=input2;
			smallername=input1;
		}
		else{
			longername=input2;
			smallername=input1;
			}
				}
		 }
	}	
		String reverse=new StringBuffer(input3).reverse().toString();
	output1=longername.charAt(0)+smallername+input3.charAt(b-1)+reverse.charAt(b-1);
for(int j=0;j<output1.length();j++){
	if(Character.isUpperCase(output1.charAt(j))){
		output2+=output1.substring(j,j+1).toLowerCase();
	}
	else if(Character.isLowerCase(output1.charAt(j))){
		output2+=output1.substring(j,j+1).toUpperCase();
		}
	else{
		output2+=output1.substring(j,j+1);
	}
}
	}
}
