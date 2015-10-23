import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> arr= new ArrayList<Integer>();
		int h= s.nextInt();
		for(int i=0;i<h;i++){
			arr.add(s.nextInt());
		}
		int min= Collections.min(arr);
		boolean isMod[]= new boolean[min+1];
		for(int i=2;i<min;i++){
			isMod[i]= true; 
		}
		
	}
}
