import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		BST obj= new BST();
		int arr[]= new int[1000];
		int n= s.nextInt();
		for(int i=0;i<n;i++){
			arr[i]= s.nextInt();
			obj.insert(arr[i]);
		}
		int ans= obj.orderings(obj.root);
		System.out.println(ans);
	}
}
