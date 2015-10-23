import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			String str1= s.next();
			String str2= s.next();
			//System.out.println(str1);
			//System.out.println(str2);
			int count=0,flag=0;
			if(str1.length()>=str2.length()){
				for(int i=0,j=0;i<str1.length();i++){
					if(count!=str2.length() && str1.charAt(i)==str2.charAt(j)){
						count++;
						j++;
					}
					if(count==str2.length()){
						System.out.println("YES");
						flag=1;
						break;
					}
				}
			}
			else{
				for(int i=0,j=0;i<str2.length();i++){
					//System.out.println(str2);
					if(count!=str1.length() && str2.charAt(i)==str1.charAt(j)){
						//System.out.println("dewd");
						count++;
						j++;
					}
					if(count==str1.length()){
						System.out.println("YES");
						flag=1;
						break;
					}

				}
			}
			//System.out.println(flag);
			if(flag==0) System.out.println("NO");
			s.nextLine();
		}
	}
}
