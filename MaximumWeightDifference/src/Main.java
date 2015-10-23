import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> arr= new ArrayList<Integer>();
		ArrayList<Integer> arr1= new ArrayList<Integer>();
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int n= s.nextInt();
			int k= s.nextInt();
			for(int i=0;i<n;i++)
				arr.add(s.nextInt());
			for(int i=0;i<k;i++){
				int min= Integer.MAX_VALUE;
				for(int j=0;j<n-i;j++){
					if(arr.get(j)<min){
						min= arr.get(j);
					}
				}
				arr1.add(arr.remove(arr.indexOf(min)));
			}
			//System.out.println(arr);
			arr.add(-1);
			arr1.add(-1);
			int sum=0;
			for(int i=0;arr.get(i)!= -1;i++){
				sum= sum+ arr.get(i);
			}
			int sum1=0;
			for(int i=0;arr1.get(i)!= -1;i++){
				sum1= sum1+ arr1.get(i);
			}
			//System.out.println(sum);
			//System.out.println(sum1);
			if(sum>sum1)
			System.out.println(sum- sum1);
			else System.out.println(sum1-sum);
			arr.clear();
			arr1.clear();
		}
	}
}
