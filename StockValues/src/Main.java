import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> arr= new ArrayList<Integer>();
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int sum[]= new int[100000];
			int n= s.nextInt();
			for(int i=0;i<n;i++){
				arr.add(s.nextInt());
			}
			int j=0;
			/*for(int i=1;i<n-1;i++){
				if(arr.get(i-1)% 2==0 && arr.get(i+1)%2==0){
					arr.set(i, (arr.get(i-1)+arr.get(i+1))/2);
					for(int k=0;k< n/2 ;k++){
						sum[j]= sum[j]+ Math.abs(arr.get(k)- arr.get(n-k-1));
					}
					j++;
				}
			}*/
			int arr1[]= new int[n+1];
			int z=0;
			for(int i=1;i<n-1;i++){
				if(arr.get(i-1)% 2==0 && arr.get(i+1)%2==0){
					arr1[z]= i;
					z++;
				}
			}
			//System.out.println(z);
			ArrayList<Integer> arr2= new ArrayList<>();
			for(int i=0;i<z;i++){
				//System.out.println(arr1[i]);
				arr.set(arr1[i], (arr.get(arr1[i]-1)+arr.get(arr1[i]+1))/2);
				for(int k=0;k< n/2 ;k++){
					sum[j]= sum[j]+ Math.abs(arr.get(k)- arr.get(n-k-1));
				}
				j++;
				System.out.println(sum[j-1]);
				for(int h=0;h<arr.size();h++){
					arr2.add(arr.get(h));
				}
				//arr2= arr;
				for(int x=i+1;x<z;x++){
					System.out.println(arr2);
					arr2.set(arr1[x], (arr2.get(arr1[x]-1)+arr2.get(arr1[x]+1))/2);
					for(int k=0;k< n/2 ;k++){
						sum[j]= sum[j]+ Math.abs(arr2.get(k)- arr2.get(n-k-1));
					}
				System.out.println(arr2);
				System.out.println(sum[j]);
					j++;
					arr2.clear();
					for(int h=0;h<arr.size();h++){
						arr2.add(arr.get(h));
					}
				}
				arr2.clear();
				//System.out.println(sum[j-1]);
				//arr2= arr;
				//System.out.println(arr2);
			}
			int max= Integer.MIN_VALUE;
			for(int i=0;i<j;i++){
				if(sum[i]>max){
					max= sum[i];
				}
			}
			System.out.println(max);
			arr.clear();
			//arr2.clear();
		}
	}
}