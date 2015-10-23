import java.util.*;
public class Tester {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		BST node= new BST();
		int n= s.nextInt();
		int arr[]= new int[n+1];
		for(int i=0;i<n;i++){
			arr[i]= s.nextInt();
			node.insert(arr[i]);
		}
		node.Inorder(node.head);
	}

}
