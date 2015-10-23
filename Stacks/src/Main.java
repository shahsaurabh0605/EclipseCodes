import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int arr[]= new int[1000001];
			ArrayList<Integer> arr2= new ArrayList<Integer>();
			int arr1[]= new int[1000001];
			int n= s.nextInt();
			for(int i=0;i<n;i++){
				arr[i]= s.nextInt();
			}
			arr2.add(arr[0]);
			int j=1;
			for(int i=1;i<n;i++){
				if(arr[i]>=arr2.get(j-1)){
					arr2.add(arr[i]);
					j++;
				}
				else{
					int index=Collections.binarySearch(arr2, arr[i]);
					if(index>=0){
						arr2.set(index+1, arr[i]);
					}
					else
					arr2.set(Math.abs(index+1), arr[i]);
					//System.out.println(index);
				}
			}
			System.out.print(j+" ");
			for(int i=0;i<j;i++){
				System.out.print(arr2.get(i)+" ");
			}
			System.out.println();
			arr2.clear();
		}
	}
}
