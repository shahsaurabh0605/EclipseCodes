import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		Sorting obj= new Sorting();
		int arr[]= new int[100];
		//int arr1[]= new int[100];
		int len= s.nextInt();
		for(int i=0;i<len;i++){
			arr[i]= s.nextInt();
		}
		obj.heapSort(arr,len);
	}
}
