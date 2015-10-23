import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> arr1= new ArrayList<>();
		ArrayList<Integer> arr2= new ArrayList<>();
		int t=s.nextInt();
		for(int p=0;p<t;p++){
			int n=s.nextInt();
			for(int i=0;i<n;i++){
				arr1.add(s.nextInt());
				arr2.add(s.nextInt());
			}
			int minx= Collections.min(arr1);
			int indexx= arr1.indexOf(minx);
			int miny= Collections.min(arr2);
			int indexy= arr2.indexOf(miny);
			
		}
	}
}
