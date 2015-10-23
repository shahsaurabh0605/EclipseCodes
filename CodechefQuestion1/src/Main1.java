import java.util.*;
class Main1 {
	public static void main(String args[]){
		long count=-1;
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			long num= s.nextLong();
			long square=0, prev=0;
			for(int x=0;;x++){
				square= (square+x+prev);
				if(square>num) break;
				count++;
				//System.out.println(square);
				prev=x;
			}
			System.out.println(count);
			count=-1;
		}
	}
}
