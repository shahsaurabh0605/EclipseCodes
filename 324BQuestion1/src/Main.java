import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int t= s.nextInt();
		if(t==10){
			if(n==1){
				System.out.println("-1");
			}
			else{
			System.out.print("1");
			for(int i=0;i<n-1;i++){
				System.out.print("0");
			}
			}
		}
		else{
			for(int i=0;i<n;i++){
				System.out.print(t);
			}
		}
	}
}

