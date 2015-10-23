import java.util.*;
public class Main {
	public static void main(String args[]){
		int count=0,count1=0;
		Scanner s= new Scanner(System.in);
		int arr[]= new int[1000];
		int t= s.nextInt();
		for(int p=0;p<t;p++){
		int len= s.nextInt();
		for(int i=0;i<len;i++){
			arr[i]= s.nextInt();
		}
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(arr[i]>arr[j]){
					count++;
				}
			}
		}
		for(int i=0;i<len-1;i++){
			if(arr[i]>arr[i+1]){
				count1++;
			}
		}
		if(count==count1){
			System.out.println("YES");
		}
		else System.out.println("NO");
			count=0;
			count1=0;
		}
		/*for(int i=0;i<len;i++)
		System.out.println(arr1[i]);*/
	}
}
