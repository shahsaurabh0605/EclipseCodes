import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		BST obj= new BST();
		int n= s.nextInt();
		for(int i=0;i<n;i++){
			obj.insert(s.nextInt());
		}
		int k= obj.find(n);
		System.out.println(k);
	}
}