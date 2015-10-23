import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int count=0;
		//ArrayList<Integer> arr= new ArrayList<Integer>();
		int num= s.nextInt();
		String x= Integer.toString(num,2);
		//System.out.println(x);
		for(int i=0;i<x.length();i++){
			if(x.charAt(i)=='1'){
				count++;
			}
		}
		System.out.println(count);
	}
}
