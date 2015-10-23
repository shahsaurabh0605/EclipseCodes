import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int num= s.nextInt();
			if(num%4==1){
				System.out.println("ALICE");
			}
			else{
				System.out.println("BOB");
			}
		}
	}
}
