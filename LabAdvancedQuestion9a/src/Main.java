import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int arr[]= new int[100000]; 
		int len= s.nextInt();
		for(int i=0;i<len;i++){
			arr[i]= s.nextInt();
		}
		radixSort(arr,len);
	}

	private static void radixSort(int[] arr, int len) {
		int max= Integer.MIN_VALUE;
		int arr1[]= new int[len];
		for(int i=0;i<len;i++){
			if(arr[i]>max)
				max= arr[i];
		}
		for(int exp=1;max/exp >0;exp*=10){
			 arr1 = countingSort(arr,len,exp);
		}
		for(int i=0;i<len;i++)
		System.out.print(arr1[i]+" ");
	}

	private static int[] countingSort(int[] a, int len, int exp) {
		int count[]= new int[11];
		int output[]= new int[len+1];
		for(int i=0;i<len;i++)
			count[(a[i]/exp)%10]++;
		
		for(int i=1;i<=10;i++)
			count[i]= count[i]+ count[i-1];
		for(int i=len-1;i>=0;i--){
			output[count[(a[i]/exp)%10]]= a[i];
			count[(a[i]/exp)%10]--;
		}
		//System.out.println();
		 for (int i = 1; i <= len; i++){
		        a[i-1] = output[i];
		}
		 for(int i=0;i<len;i++){
				System.out.print(a[i]+" ");
			}
		 	System.out.println();
		 return a;
	}
}
