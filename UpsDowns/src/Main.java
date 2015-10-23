import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		long arr[]= new long[100000000];
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int n= s.nextInt();
			for(int i=0;i<n;i++){
				arr[i]= s.nextInt();
				//System.out.println(arr[i]);
			}
			for(int i=0;i<n-1;i++){
				if(i%2==0 && arr[i+1]<arr[i]){
					long tem= arr[i];
					arr[i]= arr[i+1];
					arr[i+1]= tem;
				}
				else if(i%2!=0 && arr[i+1]>arr[i]){
					
					long tem= arr[i];
					arr[i]= arr[i+1];
					arr[i+1]= tem;
				}
			}
			for(int i=0;i<n;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
}
