import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> a1= new ArrayList<Integer>();
		ArrayList<Integer> a2= new ArrayList<Integer>();
		int arr[]= new int[10000];
		ArrayList<Integer> a3= new ArrayList<Integer>();
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int n= s.nextInt();
			for(int i=0;i<n;i++){
				a1.add(s.nextInt());
			}
			for(int i=0;i<n;i++){
				a2.add(s.nextInt());
			}
			for(int k=1;k<=1000;k++){
				for(int j=0;j<n;j++){
					if(a1.get(j)<=k && a2.get(j)>k){
						arr[k]++;
					}
				}
			}
			int max= Integer.MIN_VALUE;
			for(int k=0;k<=1000;k++){
				if(arr[k]>max){
					max= arr[k];
				}
			}
			System.out.println(max);
			a1.clear();
			a2.clear();
			Arrays.fill(arr,new Integer(0));
		}
	}
}
