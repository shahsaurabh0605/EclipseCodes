import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int arr[][]= new int[100][100];
		int n= s.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]= s.nextInt();
			}
		}
		int key= s.nextInt();
		binarysearch(arr,key,0,n-1);
	}

	private static void binarysearch(int[][] arr, int key,int low,int high) {
		int mid= arr[high][low];
		int n= high+1;
		while(high>=0 && low<=n-1){
			//System.out.println(high);
			if(key==mid){
				System.out.println("row= "+high+" column= "+low);
				break;
			}
			else if(key>mid){
				mid= arr[high][low+1];
				low= low+1;
			}
			else{
				mid= arr[high-1][low];
				high= high-1;
			}
		}
	}
}
