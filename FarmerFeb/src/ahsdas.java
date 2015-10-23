
public class ahsdas {
	public static void main(String[] args) {
		int dp[]=new int [10000];
		for(int i=0;i<10000;i++)
			dp[i]=-1;
		System.out.println(fib(1000,dp));
	}
	
	public static int fib(int n,int dp[]){
		if(n<=1)
			return 1;
		if(dp[n]==-1){
			dp[n]=fib(n-1,dp) + fib(n-2,dp);
		}
		return dp[n];
	}
}
