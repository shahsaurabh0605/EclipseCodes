
public class Sorting {
	int largest;
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
	public void display(int arr[],int len){
		for(int i=0;i<len;i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
