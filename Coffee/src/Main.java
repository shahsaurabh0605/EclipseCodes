import java.util.*;
class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> arr= new ArrayList<Integer>();
		int a[]= new int[10000];
		int t= s.nextInt();
		for(int p=0;p<t;p++){
		int n= s.nextInt();
		int k= s.nextInt();
		int d= s.nextInt();
		int m= s.nextInt();
		for(int i=0;i<n;i++){
			arr.add(s.nextInt());
		}
		//System.out.println(arr);
		Collections.sort(arr);
		int x=0;
		int j=0;
		for(int i= n-1;i>=0;i--){
			if(x==k) break;
			if((k-x)> i-d){
				arr.set(j, 0);
				x++;
				j++;
			}
			else if(i-d >= 0){
				arr.set(i-d, 0);
				i= i-d;
				x++;
			}
		}
		int count=0;
		System.out.println(arr);
		for(int i=0;i<arr.size();i++){
			count= count+ arr.get(i)*m;
		}
		System.out.println(count);
		arr.clear();
		}
	}
}