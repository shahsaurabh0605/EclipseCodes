import java.util.*;
public class Main2 {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int  arr1[]= new int[100000];
		int arr2[]= new int [100000];
		long n= s.nextLong();
		long q= s.nextLong();
		for(int i=0;i<=n;i++){
			arr1[i]= -1;
			arr2[i]= -1;
		}
		for(int p=0;p<q;p++){
			int a= s.nextInt();
			int b= s.nextInt();
			int c= s.nextInt();
			if(a==3){
				if(arr2[b]==1 && arr2[c]==1){
					System.out.println("-1");
				}
				else{
					arr1[b]= 1;
					arr1[c]=  1;
				}
				/*for(int i=0;i<n;i++){
					System.out.print(arr1[i]);
					//System.out.print(arr2[i]);
				}
				System.out.println();
				for(int i=0;i<=n;i++){
					System.out.print(arr2[i]);
				}*/
			}
			else if(a==4){
				if(arr1[b]==1 && arr1[c]==1){
					System.out.println("-1");
				}
				else{
					arr2[b]= 1;
					arr2[c]=  1;
				}
			}
			else if(a==1){
				if(arr1[b]==1 && arr1[c]==1){
					System.out.println("YES");
				}
				else System.out.println("NO");
			}
			else{
				if(arr2[b]==1 && arr2[c]==1){
					System.out.println("YES");
				}
				else System.out.println("NO");
			}
		}		
	}
	
}