import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		ArrayList<Long> arr= new ArrayList<>();
		int n= s.nextInt();
		for(int i=0;i<n;i++){
			arr.add(s.nextLong());
		}
		long mod= 1000000009;
		Collections.sort(arr);
		long sum= 0,sum1=0;
		for(int i=0;i<n-1;i++){
			long min1= arr.get(0);
			//System.out.println(min1);
			long min2= arr.get(1);
			sum= min1+min2;
			sum1= (sum1+sum);
			arr.remove(0);
			arr.remove(0);
			//System.out.println(sum);
			System.out.println(arr);
			int x= Collections.binarySearch(arr, sum);
			if(x>=0){
				arr.add(x, sum);
			}
			else{
				arr.add((Math.abs(x)-1),sum);
			}
			System.out.println(arr);
		}
		System.out.println(sum1);
	}
}

