import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> arr= new ArrayList<Integer>();
		ArrayList<Integer> temp= new ArrayList<Integer>();
		
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int count=0;
			int l=s.nextInt();
			int r= s.nextInt();
			for(int i=l;i<=r;i++){
				int x= i;
				int length = (int)(Math.log10(i)+1);
				//System.out.println(i);
				for(int k=1;k<=length;k++){
					//System.out.println("ddqw");
					arr.add(x % 10);
					temp.add(x%10);
					x= x/10;
					
				}
				Collections.reverse(arr);
				if(temp.equals(arr)){
					//System.out.println(temp);
					count= count+ i;
				}
				temp.clear();
				arr.clear();
			}
			System.out.println(count);
			//System.out.println(length);
		}
	}
}