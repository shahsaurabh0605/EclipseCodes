import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int arr[]= new int [100];
		int len= s.nextInt();
		for(int i=0;i<len;i++){
			arr[i]= s.nextInt();
		}
		int max= pivot(arr,0,len-1);
		System.out.println("Index of max= "+max);
	}

	public static int pivot(int[] arr, int low, int high) {
		if(low>high) return low+1;
		else if(low==high) return low;
		int mid= (low+high)/2;
		if(mid< high && arr[mid]> arr[mid+1]){
			return mid;
		}
		if(mid> low && arr[mid]< arr[mid-1]){
			return mid-1;
		}
		if(arr[low]>= arr[mid]){
			return pivot(arr,low,mid-1);
		}
		else return pivot(arr,mid+1,high);
		// TODO Auto-generated method stub
	}
}
