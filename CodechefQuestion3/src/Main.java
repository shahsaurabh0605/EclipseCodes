import java.util.*;
public class Main {
	public static void main(String args[]){
		long sum=0;
		Scanner s= new Scanner(System.in);
		long arr[]= new long[10000000];
		int n= s.nextInt();
		for(int i=1;i<=n;i++){
			arr[i]= s.nextInt();;
		}
		int q= s.nextInt();
		for(int p=0;p<q;p++){
			int x= s.nextInt();
			int y= s.nextInt();
			for(int j=0;;j++){
				if((x+(j*y))>n){
					break;
				}
				sum= sum+ arr[x + j*y];
			}
			System.out.println(sum);
			sum=0;
		}
	}
}
