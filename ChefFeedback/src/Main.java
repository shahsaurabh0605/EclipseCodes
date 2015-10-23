import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			String str1= s.next();
			String check1= "010";
			String check2= "101";
			boolean one= str1.contains(check1);
			boolean two= str1.contains(check2);
			if(one || two) System.out.println("Good");
			else System.out.println("Bad");
			//s.nextLine();
		}
	}
}
