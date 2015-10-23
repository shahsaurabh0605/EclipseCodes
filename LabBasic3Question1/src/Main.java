import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int arr[]= new int[100];
		int n= s.nextInt();
		for(int i=1;i<=n;i++) 
			arr[i]= s.nextInt();
		
		int node= s.nextInt();
		System.out.println("parent "+arr[node/2]);
		System.out.println("Left child= "+arr[2*node]);
		System.out.println("right child= "+arr[(2*node)+1]);
	}
}