import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		BST obj= new BST();
		int n= s.nextInt();
		for(int i=0;i<n;i++){
			obj.insert(s.nextInt());
		}
		int key= s.nextInt();
		Link find= obj.search(key);
		obj.RotateLeft(find);
		obj.preorder(obj.head);
		int key1= s.nextInt();
		Link find1= obj.search(key1);
		obj.RotateRight(find1);
		obj.preorder(obj.head);
	}
}
