import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		ArrayList<Integer> row= new ArrayList<>();
		ArrayList<Integer> column= new ArrayList<>();
		for(int i=1;i<=n*n;i++){
			int x= s.nextInt();
			int y= s.nextInt();
			if(!row.contains(x) && !column.contains(y)){
				row.add(x);
				column.add(y);
				System.out.print(i+" ");
			}
		}
	}
}
