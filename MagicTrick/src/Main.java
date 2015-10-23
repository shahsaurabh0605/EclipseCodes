import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int h= s.nextInt();
			if(h==1){
				System.out.println("1");
			}
			else{
				long nodes= (long) (Math.pow(2, h)-1);
				long ans= nodes/2;
				System.out.println(ans);
			}
		}
	}
}
