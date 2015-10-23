import java.util.*;
public class Main {
	public static void main(String args[]){
		int count=0;
		Scanner s= new Scanner(System.in);
		String str1= s.nextLine();
		String str2= s.nextLine();
		//System.out.println(str1);
		if(str1.length()!= str2.length()){
			System.out.println("-1");
		}
		else{
			int count1=0,count2=0,count3=0,count4=0;
			for(int i=0;i<str1.length();i++){
				//System.out.println(str1.charAt(i));
				if(str1.charAt(i)== '1'){
					//System.out.println("dwd");
					count1++;
				}
				else count2++;
				if(str2.charAt(i)=='1') count3++;
				else count4++;
			}
			//System.out.println("count1= "+count1);
			if(count1==count3 && count2==count4){
				for(int i=0;i<str1.length();i++){
					if(str1.charAt(i)!= str2.charAt(i)){
						count++;
					}
				}
				System.out.println(count/2);
			}
			else{
				System.out.println("-1");
			}
		}
	}
}