import java.util.*;
public class Main {
	public static void main(String args[]){
		int count=0;
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int i=0;i<t;i++){
			String s1= s.next();
			s.nextLine();
			String s2= s.next();
			for(int j=0;j<s2.length();j++){
				for(int k=0;k<s1.length();k++){
					if(s2.charAt(j)==s1.charAt(k)){
						count++;
						break;
					}
				}
			}
			System.out.println(count);
			count=0;
		}
	}
}
