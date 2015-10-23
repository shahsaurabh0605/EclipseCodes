import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		String str1= s.nextLine();
		String str2= s.nextLine();
		String str1rev= reverse(str1);
		int flag=0;
		if(str1.length()==1){
			if(str2.length()!=1 && str1rev.equals(str2.charAt(1))){
				str1= str1+ 'B';
				str1= reverse(str1);
				if(!str1.equals(str2.substring(0, str1.length()))){
				//	System.out.println("dwd");
					System.out.println("Impossible");
					flag=1;
				}
				else{
					for(int i=str1.length();i<str2.length();i++){
						if(str2.charAt(i)=='A'){
							str1= str1 + 'A';
						}
						else{
							str1= str1 + 'B';
							str1 = reverse(str1);
							if(!str1.equals(str2.substring(0, str1.length()))){
			//					System.out.println("dadaff");
								System.out.println("Impossible");
								flag=1;
								break;
							}
						}
					}
				}
			}
			else if(str1.equals(str2.substring(0, str1.length()))/*&& str1.length()!=1*/){
				for(int i=str1.length();i<str2.length();i++){
					if(str2.charAt(i)=='A'){
						str1= str1 + 'A';
					}
					else{
						str1= str1 + 'B';
						str1 = reverse(str1);
						if(!str1.equals(str2.substring(0, str1.length()))){
							//System.out.println("wqdq");
							System.out.println("Impossible");
							flag=1;
							break;
						}
					}
				}
				
			}
			else{
				System.out.println("Impossible");
				flag=1;
			}
		}
		else if(str1.equals(str2.substring(0, str1.length()))/*&& str1.length()!=1*/){
			for(int i=str1.length();i<str2.length();i++){
				if(str2.charAt(i)=='A'){
					str1= str1 + 'A';
				}
				else{
					str1= str1 + 'B';
					str1 = reverse(str1);
					if(!str1.equals(str2.substring(0, str1.length()))){
						//System.out.println("wqdq");
						System.out.println("Impossible");
						flag=1;
						break;
					}
				}
			}
		}
		else if(str1rev.equals(str2.substring(1, str1.length()+1))/* && str1.length()!=1*/){
			str1= str1+ 'B';
			str1= reverse(str1);
			if(!str1.equals(str2.substring(0, str1.length()))){
			//	System.out.println("dqwd");
				System.out.println("Impossible");
				flag=1;
			}
			else{
				for(int i=str1.length();i<str2.length();i++){
					if(str2.charAt(i)=='A'){
						str1= str1 + 'A';
					}
					else{
						str1= str1 + 'B';
						str1 = reverse(str1);
						if(!str1.equals(str2.substring(0, str1.length()))){
				//			System.out.println("ewff");
							System.out.println("Impossible");
							flag=1;
							break;
						}
					}
				}
			}
		}
		else{
			//System.out.println(str2.substring(1, str1.length()+1));
		//	System.out.println("qwd");
			System.out.println("Impossible");
			flag=1;
		}
		if(flag==0){
			System.out.println("Possible");
		}
	}
	public static String reverse(String str1){
		String ans="";
		for(int i= str1.length()-1;i>=0;i--){
			ans= ans + str1.charAt(i);
		}
		return ans;
	}
}
