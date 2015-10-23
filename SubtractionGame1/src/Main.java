import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int arr[]= new int[11000];
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int num= s.nextInt();
			for(int i=0;i<num;i++){
				arr[i]= s.nextInt();
			}
			int x= arr[0];
			for(int i=1;i<num;i++){
				x= gcd(arr[i],x);
				//System.out.println(" "+x);
			}
			System.out.println(x);
		}
	}
	public static int gcd(int a,int b){
		if(b==0) return a;
			return gcd(b,a%b);
	}
}
