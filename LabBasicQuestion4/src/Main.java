import java.util.*;
public class Main {
	public static void main(String args[]){
		ArrayList<Integer> a= new ArrayList<>();
		ArrayList<Integer> arr= new ArrayList<>();
		Scanner s= new Scanner(System.in);
		QuickSelect obj= new QuickSelect();
		int len= s.nextInt();
		for(int i=0;i<len;i++){
			a.add(s.nextInt());
		}
		int rank= s.nextInt();
		int x= obj.QuickSort(a,0,len-1,rank);
		System.out.println(x);
	}
}
