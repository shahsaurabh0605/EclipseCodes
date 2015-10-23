import java.util.Scanner;
import java.util.*;
public class Main {
public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			BST obj= new BST();
			int len= s.nextInt();
			int arr[]= new int[len+1];
			for(int i=0;i<len;i++){
				arr[i]= s.nextInt();
				obj.insert(arr[i]);
			}
		int choice= s.nextInt();
		switch(choice){
			case 1:
				int find= s.nextInt();
				Link node= obj.search(obj.root,find);
				break;
			case 2:
				int max= obj.max(obj.root);
				System.out.println("max= "+max);
				break;
			case 3:
				int min= obj.min(obj.root);
				System.out.println("min= "+min);
				break;
			case 4:
				int key= s.nextInt();
				Link node1= obj.search(obj.root, key);
				int found= obj.successor(node1);
				System.out.println(found);
				break;
			case 5:
				int key1= s.nextInt();
				Link node2= obj.search(obj.root, key1);
				int found1= obj.predecessor(node2);
				System.out.println(found1);
				break;
		}
	}
}
