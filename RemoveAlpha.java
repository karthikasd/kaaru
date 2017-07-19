package string_9;
public class RemoveAlpha {

	public static void main(String[] args){
		
		String given="AA123BB4";
		char ch[]=given.toCharArray();
		for(int i=0;i<given.length();i++){
			if(!((ch[i]>='A')&&(ch[i]<='Z'))||((ch[i]>='a')&&(ch[i]<='z'))){
				System.out.println(ch[i]);
			}
		}
	}

}
