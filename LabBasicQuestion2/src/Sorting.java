import java.util.*;
public class Sorting {
	int largest;
	public void bubblesort(int[] arr,int len) {
		int temp;
		for(int i=0;i<len-1;i++){
			for(int j=0;j<len-1;j++){
				if(arr[j]>arr[j+1]){
					temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		display(arr,len);
		// TODO Auto-generated method stub
		
	}

	public void insertionsort(int[] arr,int len) {
		int temp;
		for(int i=1;i<len;i++){
			//int key= arr[i];
			for(int j=i;j>0;j--){
				if(arr[j-1]>arr[j]){
					temp= arr[j-1];
					arr[j-1]= arr[j];
					arr[j]= temp;
				}
			}
		}
		display(arr,len);
		// TODO Auto-generated method stub
		
	}

	public void selectionsort(int[] arr,int len) {
		int temp;
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len;j++){
				if(arr[i]>arr[j]){
					temp= arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		display(arr,len);
		// TODO Auto-generated method stub
		
	}

	public void quicksort(int[] arr,int first,int last,int len) {
		int temp;
		int pivot= arr[first+ (last- first)/2];
		int i= first;
		int j= last;
		while(i<=j){
			while(arr[i]<pivot){
				i++;
			}
			while(arr[j]>pivot){
				j--;
			}
			if(i<=j){
				temp= arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
				i++;
				j--;
			}
		}
		if(first<j){
			quicksort(arr,first,j,len);
		}
		if(last>i){
			quicksort(arr,i,last,len);
		}
		return;
		//display(arr,len);
		// TODO Auto-generated method stub
		
	}
	public void display(int arr[],int len){
		for(int i=0;i<len;i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	public int[] mergeSort(int[] arr, int p, int r) {
		if(p<r){
			int q= (p+r)/2;
			mergeSort(arr,p,q);
			mergeSort(arr,q+1,r);
			Merge(arr,p,q,r);
		}
		return arr;
		//display(arr,r);
		// TODO Auto-generated method stub
	}

	private void Merge(int[] arr, int p, int q, int r) {
		int n1= q-p+1;
		int n2= r-q;
		int[] arr1= new int[100];
		int[] arr2= new int[100];
		for(int i=p;i<=q;i++){
			arr1[i-p]=arr[i];
		}
		for(int j=q+1;j<=r;j++){
			arr2[j-q-1]= arr[j];
		}
		arr1[n1]= Integer.MAX_VALUE;
		arr2[n2]= Integer.MAX_VALUE;
		int i=0;
		int j=0;
		for(int k=p;k<=r;k++){
			if(arr1[i]<=arr2[j]){
				arr[k]= arr1[i];
				i++;
			}
			else{
				arr[k]= arr2[j];
				j++;
			}
		}
	//display(arr,r+1);
		// TODO Auto-generated method stub
		
	}

	public void heapSort(int[] arr,int len) {
		int heapsize= len;
		BuildMaxHeap(arr,len);
		for(int i=len;i>=2;i--){
			int t= arr[0];
			arr[0]= arr[i-1];
			arr[i-1]= t;
			heapsize--;
			MaxHeapify(arr,1,heapsize);
		}
		display(arr,len);
		// TODO Auto-generated method stub
		
	}

	public void BuildMaxHeap(int[] arr,int len) {
		int heapsize= len;
		for(int i= len/2;i>=1;i--){
			MaxHeapify(arr,i,heapsize);
		}
		// TODO Auto-generated method stub
		
	}

	public void MaxHeapify(int[] arr, int i, int heapsize) {
		int left= 2*i;
		int right= (2*i)+1;
		if(left<=heapsize && arr[left-1]>arr[i-1]){
			 largest= left;
		}
		else largest= i;
		if(right<= heapsize && arr[right-1]>arr[largest-1]){
			largest= right;
		}
		if(largest!= i){
			int t= arr[largest-1];
			arr[largest-1]= arr[i-1];
			arr[i-1]= t;
			MaxHeapify(arr,largest,heapsize);
		}
		// TODO Auto-generated method stub
		
	}
}
