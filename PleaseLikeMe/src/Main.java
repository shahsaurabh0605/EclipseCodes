import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int l= s.nextInt();
			int d= s.nextInt();
			int d1= s.nextInt();
			int c= s.nextInt();
			int temp= (int) (d1*(Math.pow(c+1,d-1)));
			if(temp>=l){
				System.out.println("ALIVE AND KICKING");
			}
			else{
				System.out.println("DEAD AND ROTTING");
			}
		}
	}
}
