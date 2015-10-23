import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int x= s.nextInt();
			int y= s.nextInt();
			int sum= x+y;
			int i;
			for( i=sum+1;i<2*sum;i++){
				if(PrimeCheck(i)){
					break;
				}
			}
			System.out.println(i-sum);
		}
	}

	private static boolean PrimeCheck(int num) {
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
		// TODO Auto-generated method stub
		
	}
}