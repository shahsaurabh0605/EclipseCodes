package qwerty;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> arr= new ArrayList<>();
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int num= s.nextInt();
			for(int i=0;i<num;i++){
				arr.add(s.nextInt());
			}
			long sum=0;
			for(int i=0;i<num;i++){
				if(arr.get(i)==1){
					sum=sum+1;
				}
				else{
					long x= getPrime(arr.get(i));
					sum=sum+x;
				}
			}
			System.out.println(sum);
			arr.clear();
		}
	}
	public static int getPrime(int n){
		long x= 2*n;
		int i;
		for( i=n+1;i<x;i++){
			if(sieve(i)){
				break;
			}
		}
		return i;
	}
	public static boolean sieve(int N){
		boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        // mark non-primes <= N using Sieve of Eratosthenes
        for (int i = 2; i*i <= N; i++) {

            // if i is prime, then mark multiples of i as nonprime
            // suffices to consider mutiples i, i+1, ..., N/i
            if (isPrime[i]) {
                for (int j = i; i*j <= N; j++) {
                    isPrime[i*j] = false;
                }
            }
        }
        if(isPrime[N]){
        	return true;
        }
        else return false;
	}
}
