import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Main1 {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> arr= new ArrayList<Integer>();
		//int a[]= new int[10000];
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
		for(int i=0;i<arr.size();i++){
			int max= Collections.max(arr);
			int index= arr.indexOf(max);
		if(index-1-d>0){
			arr.set(index-1-d,0);
			break;
		}
		}
		int count=0;
		//System.out.println(arr);
		int  index= arr.indexOf(0);
		//System.out.println(index);
		for(int i=0;i<index;i++){
			
			count= count+ arr.get(i);
		}
		for(int i=index+1;i<arr.size();i++){
			count= count+ arr.get(i)*m;
		}
		System.out.println(count);
		arr.clear();
		}
	}
}