import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int arr[]= new int[100];
		int len= s.nextInt();
		for(int i=0;i<len;i++){
			arr[i]= s.nextInt();
		}
		int min= Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;
		if(len%2==0){
			if(arr[0]>arr[1]){
				max= arr[0];
				min= arr[1];
			}
			else{
				max= arr[1];
				min= arr[0];
			}
			int i=2;
			while(i<len){
				if(arr[i]>arr[i+1]){
					if(arr[i]>max) max= arr[i];
					if(arr[i+1]<min) min= arr[i+1];
				}
				else{
					if(arr[i]<min) min= arr[i];
					if(arr[i+1]>max) max= arr[i+1];
				}
				i= i+2;
			}
		}
		else{
			min= arr[0];
			max= arr[0];
			int i=1;
			while(i<len){
				if(arr[i]>arr[i+1]){
					if(arr[i]>max) max= arr[i];
					if(arr[i+1]<min) min= arr[i+1];
				}
				else{
					if(arr[i]<min) min= arr[i];
					if(arr[i+1]>max) max= arr[i+1];
				}
				i= i+2;
			}
		}
		System.out.println("min= "+min);
		System.out.println("max= "+max);
	}
}
