import java.util.*;
class Main {
	public static void main(String args[]){
		long count=0;
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			long num= s.nextLong();
			long num1= num;
			for(long i=1;;i++){
				if(i*i<=num1){
					count++;
				}
				else break;
				num1= num1- i*i;
			}
			System.out.println(count);
			count=0;
			num=0;
			num1=0;
		}
	}
}
 