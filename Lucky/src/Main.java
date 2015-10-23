import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		int n= s.nextInt();
		for(int p=0;p<t;p++){
			int x= s.nextInt();
			int y= s.nextInt();
			int mod=1;
			for(int i=0;i<y;i++){
				mod= (x%n*mod%n)%n;
			}
			System.out.println(mod);
		}
	}
}