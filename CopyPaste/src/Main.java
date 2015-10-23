import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int n= s.nextInt();
			ArrayList<Integer> arr= new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				arr.add(s.nextInt());
			}
			Set<Integer> arr1= new HashSet<Integer>(arr);
			System.out.println(arr1.size());
		}
	}
}