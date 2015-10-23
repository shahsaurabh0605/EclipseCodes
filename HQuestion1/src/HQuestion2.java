import java.util.*;
public class HQuestion2 {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> arr= new ArrayList<Integer>();
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int count[]= new int[100000];
			int n= s.nextInt();
			for(int i=0;i<n;i++){
				arr.add(s.nextInt());
			}
			int k=0;
			for(int i=0;i<arr.size();i++){
				if(arr.get(i)==1){
					//System.out.println("dw");
					count[k]++;
				}
				else if(arr.get(i)==0);
				else  k++;
			}
			//System.out.println(k);
			int max= Integer.MIN_VALUE;
			int x= -1;
			if(arr.contains(x)){
			for(int i=0;i<k;i++){
				if(count[i]+count[i+1]>max){
					max= count[i]+count[i+1];
				}
			}
			System.out.println(max+"/1");
		}
			else System.out.println("0/1");
			arr.clear();
		}
		
	}
}