import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		Sorting obj= new Sorting();
		int arr[]= new int[100];
		int arr1[]= new int[100];
		int len= s.nextInt();
		for(int i=0;i<len;i++){
			arr[i]= s.nextInt();
		}
		System.out.println("Enter choice= ");
		int choice= s.nextInt();
		switch(choice){
		case 1:
			obj.bubblesort(arr,len);
			break;
		case 2:
			obj.insertionsort(arr,len);
			break;
		case 3:
			obj.selectionsort(arr,len);
			break;
		case 4:
			obj.quicksort(arr,0,len-1,len);
			obj.display(arr, len);
			break;
		case 5:
			arr1= obj.mergeSort(arr,0,len-1);
			obj.display(arr1,len);
			break;
		case 6:
			obj.heapSort(arr,len);
			//obj.heapSort();
	}
}
}
