import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		String str1= s.next();
		String str5= str1.toUpperCase();
		//System.out.println(str5);
		String str2= "abcdefghijklmnopqrstuvwxyz";
		String str4= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		s.nextLine();
		for(int i=0;i<n;i++){
			String str3= s.next();
			for(int j=0;j<str3.length();j++){
				if(str3.charAt(j)=='_'){
					System.out.print(" ");
				}
				else if(str3.charAt(j)== '.' || str3.charAt(j)== ',' || str3.charAt(j)== '!' ||str3.charAt(j)== '?'){
					System.out.print(str3.charAt(j));
				}
				else{
					if(str3.charAt(j)>=97){
						//System.out.println(str3.charAt(j));
						int index= str2.indexOf(str3.charAt(j));
						//ystem.out.print("index= "+index);
						System.out.print(str1.charAt(index));
					}
					else{
						//System.out.println(str3.charAt(j));
						int index= str4.indexOf(str3.charAt(j));
						//System.out.print("index= "+index);
						System.out.print(str5.charAt(index));
					}
				}
			}
			System.out.println();
		}
	}
}
