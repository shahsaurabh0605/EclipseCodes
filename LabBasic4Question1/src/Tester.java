import java.util.*;
public class Tester {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		BST obj= new BST();
		int len= s.nextInt();
		int arr[]= new int[len+1];
		for(int i=0;i<len;i++){
			arr[i]= s.nextInt();
			obj.insert(arr[i]);
		}
		obj.successor(obj.root);
		int choice= s.nextInt();
		switch(choice){
			case 1:
				obj.inorderRecursive(obj.root);
				System.out.println();
				obj.inorderStack(obj.root);
				System.out.println();
				obj.inorderIterative(obj.root);
				break;
			case 2:
				obj.preorderRecursive(obj.root);
				System.out.println();
				obj.preorderStack(obj.root);             
				System.out.println();
				obj.preorderIterative(obj.root);
				break;
			case 3:
				obj.postorderRecursive(obj.root);
				System.out.println();
				obj.postorderStack(obj.root);
				System.out.println();
				obj.postorderIterative(obj.root);
				break;
			case 4:
				obj.levelorder(obj.root);
				break;
			case 5:
				obj.zigzag(obj.root);
				break;
		}
	}
}
