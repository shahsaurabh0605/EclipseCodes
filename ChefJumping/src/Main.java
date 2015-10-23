import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		long num= s.nextLong();
		if(num%3 ==0 || num%6 ==1) System.out.println("yes");
		else System.out.println("no");
	}
}
