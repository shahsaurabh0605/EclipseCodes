import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int len= s.nextInt();
		int arr[]= new int[len+10];
		for(int i=1;i<=len;i++){
			arr[i]= s.nextInt();
		}
		LeafUpward(arr,len);
		int choice= s.nextInt();
		if(choice==1){
			int insert= s.nextInt();
			len++;
			arr[len]= insert;
			MaxHeapify1(arr,len,len);
			for(int i=1;i<=len;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		else if(choice==2){
			int delete= s.nextInt();
			if(arr[delete]<arr[len]){
				int t= arr[len];
				arr[len]= arr[delete];
				arr[delete]= t;
				len--;
				MaxHeapify1(arr,delete,len);
			}
			else if(arr[delete]>arr[len]){
				int t= arr[len];
				arr[len]= arr[delete];
				arr[delete]= t;
				len--;
				MaxHeapify(arr,delete,len);
			}
			for(int i=1;i<=len;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		else if(choice==3){
			int index= s.nextInt();
			int value= s.nextInt();
			arr[index]= arr[index]+value;
			MaxHeapify1(arr,index,len);
			for(int i=1;i<=len;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	private static void LeafUpward(int[] arr, int len) {
		for(int i=len/2;i>= 1;i--){
			MaxHeapify(arr,i,len);
		}
		for(int i=1;i<=len;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

	private static void RootDown(int[] arr, int len) {
		for(int i=2;i<=len;i++){
			MaxHeapify1(arr,i,len);
		}
		for(int i=1;i<=len;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void MaxHeapify(int arr[],int index,int len){
		int left= 2*index;
		int right= 2*index+1;
		int largest;
		if(left<= len && arr[left]>arr[index]){
			largest= left;
		}
		else largest= index;
		if(right<= len && arr[right]>arr[largest]){
			largest= right;
		}
		if(largest!= index){
			int t= arr[largest];
			arr[largest]= arr[index];
			arr[index]= t;
			MaxHeapify(arr,largest,len);
		}
	}
	public static void MaxHeapify1(int arr[],int index,int len){
		int parent= index/2;
		int smallest;
		if(parent>0 && arr[parent]<arr[index]){
			smallest= parent;
		}
		else smallest= index;
		if(smallest!=index){
			int t= arr[smallest];
			arr[smallest]= arr[index];
			arr[index]= t;
			MaxHeapify1(arr,smallest,len);
		}
	}
}