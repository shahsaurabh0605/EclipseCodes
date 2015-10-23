import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		s.nextLine();
		for(int p=0;p<t;p++){
			String str= s.nextLine();
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)=='z'){
					System.out.print("a");
				}
				else if(str.charAt(i)=='Z'){
					System.out.print("A");
				}
				else{
					if(str.charAt(i)>=97 && str.charAt(i)<=122){
						System.out.print((char)(str.charAt(i)+1));
					}
					if(str.charAt(i)>=65 && str.charAt(i)<=90){
						System.out.print((char)(str.charAt(i)+1));
					}
				}
			}
			System.out.println();
		}
	}
}