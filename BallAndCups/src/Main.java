import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int arr[]= new int[10000000];
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int n= s.nextInt();
			int c= s.nextInt();
			int q= s.nextInt();
			for(int i=0;i<q;i++){
				int l= s.nextInt();
				int r= s.nextInt();
				if(c>=l && c<=r){
					int x= c-l;
					int y= r-x;
					c=y;
				}
			}
			System.out.println(c);
		}
	}
}
