import java.util.*;
public class Main {
	public static void main(String args[]){
		int sum=0,count=0,count1=0;
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> arr= new ArrayList<Integer>();
		int num= s.nextInt();
		for(int p=0;p<num;p++){
		for(int i=0;i<11;i++){
			arr.add(s.nextInt());
		}
		Collections.sort(arr);
		Collections.reverse(arr);
		//System.out.println(arr);
		int k= s.nextInt();
		int min= Integer.MAX_VALUE;
		for(int j=0;j<k;j++){
			//System.out.println(sum);
			sum= sum + arr.get(j);
			if(arr.get(j)<min){
				min= arr.get(j);
			}
		}
		//System.out.println(min+"min= ");
		for(int j=0;j<11;j++){
			if(arr.get(j)==min){
				count++;
			}
		}
		for(int j=0;j<k;j++){
			if(arr.get(j)==min) count1++;
		}
		//System.out.println(count+""+ count1);
		int ans= foo(count,count1);
		System.out.println(ans);
		count=0;
		count1=0;
		sum=0;
		arr.clear();
		}
	}
	static int foo(int n,int r)
	{
	     if(n==r) return 1;
	     if(r==1) return n;
	     return foo(n-1,r) + foo(n-1,r-1);
	}
}
