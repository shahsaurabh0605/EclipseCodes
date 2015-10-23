import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		BST obj= new BST();
		int n= s.nextInt();
		for(int i=0;i<n;i++){
			obj.insert(s.nextInt());
		}
		obj.postorder(obj.head);
		int choice= s.nextInt();
		switch(choice){
			case 1:
				int key= s.nextInt();
				Link find = obj.search(key);
				if(find== null) System.out.println("Key not present");
				else System.out.println("found");
				break;
			case 2:
				int max= obj.maximum(obj.head);
				System.out.println(max);
				break;
			case 3:
				int key1= s.nextInt();
				Link find1= obj.search(key1);
				int successor= obj.successor(find);
				System.out.println(successor);
		}
		
	}
}