import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		long arr[]= new long[10000000];
		long  n= s.nextLong();
		long sum=0;
		for(int i=0;i<n;i++){
			arr[i]= s.nextLong();
			sum= sum+ arr[i];
		}
		if(sum==((n)*(n+1))/2) System.out.println("YES");
		else System.out.println("NO");
	}
}
