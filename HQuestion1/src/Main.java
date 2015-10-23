import java.util.*;
public class Main {
	public static void main(String args[]){
		int flag1=0,flag2=0;
		Scanner s= new Scanner(System.in);
		String str = s.nextLine();
		String str1= "head rush";
		String str2= "cubing club";
		int count[]= new int[410000];
		for(int i=0;i<str.length();i++){
			count[str.charAt(i)]++;
		}
		int max= Integer.MIN_VALUE;
		for(int i=90;i<150;i++){
			if(count[i]>max){
				max= count[i];
			}
		}
		int  x = 0;
		for(int i=90;i<150;i++){
			if(count[i]==max){
				x= i;
				break;
			}
		}
		//System.out.println((char)x);
		char v= (char)x;
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)==x) flag1=1;
		}
		for(int j=0;j<str2.length();j++){
			if(str2.charAt(j)==x) flag2=1;
		}
		if(flag1==0 && flag2==0){
			System.out.println("none");
		}
		else if(flag1==1 && flag2==1){
			System.out.println("Thanks both");
		}
		else if(flag1==1 && flag2==0){
			System.out.println("Thanks head rush");
		}
		else System.out.println("Thanks cubing club");
	}

	private static int gcd(int number1, int number2) {
		//base case
		if(number2 == 0){ 
		return number1; } 
	return gcd(number2, number1%number2); }
}
