import java.util.*;
public class Main1 {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		ArrayList<Long> ally= new ArrayList<Long>();
		ArrayList<Long> rival= new ArrayList<Long>();
		long n= s.nextLong();
		long q= s.nextLong();
		for(int p=0;p<q;p++){
			int a= s.nextInt();
			Long b= s.nextLong();
			Long c= s.nextLong();
			if(a==3){
				if(rival.contains(b) && rival.contains(c)){
					System.out.println("-1");
				}
				else{
					ally.add(b);
					ally.add(c);
				}
			}
			else if(a==4){
				if(ally.contains(b) && ally.contains(c)){
					System.out.println("-1");
				}
				else{
					rival.add(b);
					rival.add(c);
				}
			}
			else if(a==1){
				if(ally.contains(b) && ally.contains(c)){
					System.out.println("YES");
				}
				else System.out.println("NO");
			}
			else{
				if(rival.contains(b) && rival.contains(c)){
					System.out.println("YES");
				}
				else System.out.println("NO");
			}			
		}
	}
}