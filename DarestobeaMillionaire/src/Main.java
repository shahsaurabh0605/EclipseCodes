import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int n= s.nextInt();
			int arr[]= new int[n+2];
			s.nextLine();
			String str1,str2;
				str1= s.nextLine();
				str2= s.nextLine();
			for(int i=0;i<=n;i++){
				arr[i]= s.nextInt();
			}
			int count=0;
			for(int i=0;i<n;i++){
				if(str1.charAt(i)==str2.charAt(i)){
					count++;
				}
			}
			//System.out.println(count);
			if(count==n){
				System.out.println(arr[n]);
			}
			else{
					int max= Integer.MIN_VALUE;
					for(int i=0;i<=count;i++){
						if(arr[i]>max){
							max= arr[i];
						}
					}
					//System.out.println(max+"max= ");
					System.out.println(max);
			}
		}
	}
}
