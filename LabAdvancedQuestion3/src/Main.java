import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int arr[]= new int[100];
		int len= s.nextInt();
		for(int i=0;i<len;i++){
			arr[i]= s.nextInt();
		}
		int max= Integer.MIN_VALUE;
		for(int i=0;i<len;i++){
			if(arr[i]>max){
				max= arr[i];
			}
		}
		System.out.println(max);
	}
}
