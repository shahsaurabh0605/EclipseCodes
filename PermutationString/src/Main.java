import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int n= s.nextInt();
			int x= s.nextInt();
			int y= s.nextInt();
			int count[]= new int[n+1];
			int index[]= new int[n+1];
			int arr1[]= new int[n];
			int arr2[]= new int[n];
			for(int i=0;i<n;i++){
				arr1[i]= s.nextInt();
			}
			for(int j=0;j<n;j++){
				arr2[j]= s.nextInt();
			}
			for(int i=0;i<n;i++){
				index[arr2[i]]=i+1;
			}
			for(int i=0;i<n;i++){
				int dis= (i+1 -index[arr1[i]]);
				if(dis<0){
					dis= dis+n;
				}
				count[dis]++;
			}
			/*for(int i=0;i<n;i++){
				System.out.println(count[i]);
			}*/
			int temp[]= new int[n];
			for(int i=0;i<n;i++){
				temp[i]= i*y + (n-count[i])*x;
			}
			int min= Integer.MAX_VALUE;
			for(int i=0;i<n;i++){
				if(temp[i]<min){
					min= temp[i];
				}
			}
			System.out.println(min);
		}
	}
}
