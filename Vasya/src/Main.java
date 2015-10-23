import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int a= s.nextInt();
		int b= s.nextInt();
		int min=0,diff=0;
		if(a<=b){
			min=a;
			diff= b-a;
		}
		else {
			min=b;
			diff= a-b;
		}
		System.out.print(min+" ");
		System.out.println(diff/2);
	}
}
