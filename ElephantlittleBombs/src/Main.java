import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int arr[]= new int[10000];
		int arr1[]= new int[10000];
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int num= s.nextInt();
			s.nextLine();
			String str= s.nextLine();
			//System.out.println(str+"  ");
			for(int i=0;i<num;i++){
				arr[i+1]= (int)str.charAt(i)-48;
		} 
			arr[0]= 1;
			arr[num+1]=1;
			for(int i=0;i<=num+1;i++){
				arr1[i]=arr[i];
		}
			int count=0;
			for(int i=1;i<=num;i++){
				if(arr[i]==1){
					arr1[i-1]=1;
					arr1[i+1]=1;
				}
			}
			for(int i=1;i<=num;i++){
				if(arr1[i]==0) count++;
			}
			/*for(int i=1;i<=num;i++){
					System.out.print(arr[i]);
			}*/
			//System.out.println();
			System.out.println(count);
		}
	}
}
