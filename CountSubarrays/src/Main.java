import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int n= s.nextInt();
			int arr[]= new int[n+1];
			int count[]= new int[n+1];
			for(int i=0;i<n;i++){
				arr[i]= s.nextInt();
			}
			for(int i=0;i<n-1;i++){
				if(arr[i]<=arr[i+1]){
					count[i+1]= count[i]+1;
				}
			}
			long sum=0;
			for(int i=0;i<n;i++){
				sum= sum+ count[i];
			}
			System.out.println(sum+n);
		}
	}
}
