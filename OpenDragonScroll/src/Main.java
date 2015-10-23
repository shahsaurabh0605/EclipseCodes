import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int n= s.nextInt();
			int A= s.nextInt();
			int B= s.nextInt();
			String a= Integer.toBinaryString(A);
			String b= Integer.toBinaryString(B);
			//System.out.println(a);
			int count=0;
			for(int i=0;i<a.length();i++){
				if(a.charAt(i)=='1'){
					//System.out.println();
					count++;
				}
			}
			for(int i=0;i<b.length();i++){
				if(b.charAt(i)=='1'){
					count++;
				}
			}
			//System.out.println(count);
			int ans= (int)Math.pow(2, n)-1;
			if(count==n){
				System.out.println((int)Math.pow(2, n)-1);
			}
			else if(count<n){
				int k= n- count;
				for(int i=0;i<k;i++){
					ans= ans- (int)Math.pow(2, i);
				}
				System.out.println(ans);
			}
			else{
				int k= count-n;
				for(int i=0;i<k;i++){
					ans= ans- (int)Math.pow(2,i);
				}
				System.out.println(ans);
			}
		}
	}
}
