import java.util.*;
public class Main {
	public static long mod= 1000000007;
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		//System.out.println(expo(n,3));
		long temp= 3*n;
		long total= expo(3,temp)%mod;
		//System.out.println(total);
		long sub= expo(7,n)%mod;
		//System.out.println(sub);
		long ans= (total%mod +mod - sub%mod)%mod;
		System.out.println(ans);
		//System.out.println(Math.pow(3,30));
		//System.out.println(-5%7);
	}
	
	public static long expo(long a, long b){
	    if (b==1)
	        return a%mod;
	    if (b==2)
	        return (a%mod*a%mod)%mod;

	    if (b%2==0){
	            return expo((expo(a%mod,(b/2)%mod))%mod,2);
	    }
	    else{
	        return (a%mod)*(expo(expo(a%mod,((b-1)/2)%mod)%mod,2)%mod)%mod;
	    }
	}
}

