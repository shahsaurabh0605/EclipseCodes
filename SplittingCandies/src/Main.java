import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			long n= s.nextLong();
			long k= s.nextLong();
			if(k==0) System.out.println("0 "+n);
			else{
				long x= n/k;
				long y= n%k;
				System.out.println(x+" "+y);
			}
		}
	}
}
