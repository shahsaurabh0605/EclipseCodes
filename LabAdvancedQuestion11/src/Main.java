import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		Quick obj= new Quick();
		int arr[] = new int[100];
		int len= s.nextInt();
		for(int i=0;i<len;i++){
			arr[i]= s.nextInt();
		}
		obj.quickSort(arr,0,len-1);
		System.out.println("Total No of Comparisons= "+ obj.countComp);
		System.out.println("Total no of Exchanges=  "+ obj.countSwaps);
	}
}
