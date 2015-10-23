import java.util.*;
public class Main {
	public static void main(String args[]){
		int count=0,count1=0,count2=0,flag=0,flag1=0;
		Scanner s= new Scanner(System.in);
		int arr[]= new int[100];
		int len= s.nextInt();
		for(int i=0;i<len;i++){
			arr[i]= s.nextInt();
		}
		int k= s.nextInt();
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(arr[i]>arr[j]){
					count++;
				}
			}
		}
		//System.out.println(count);
		if(count>k){
			for(int i=0;i<len-1 && flag==0;i++){
				for(int j=0;j<len-1;j++){
					if(arr[j]>arr[j+1]){
						int t= arr[j+1];
						arr[j+1]= arr[j];
						arr[j]= t;
						count1++;
					}
					if(count1==(count-k)){
						flag=1;
						break;
					}
				}
			}
			for(int i=0;i<len;i++){
				System.out.print(arr[i]);
			}
		}
		else{
			for(int i=0;i<len-1 && flag1==0;i++){
			for(int j=0;j<len-1;j++){
				if(arr[j]<arr[j+1]){
					int t= arr[j+1];
					arr[j+1]= arr[j];
					arr[j]= t;
					count2++;
				}
				if(count2==(k-count)){
					flag1=1;
					break;
				}
			}
		}
			for(int i=0;i<len;i++){
				System.out.print(arr[i]);
			}
		}
	}
}
