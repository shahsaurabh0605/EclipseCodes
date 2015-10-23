import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int h= s.nextInt();
		if(h==1){
			System.out.print("2");
		}
		else{
			int u= 2;
			int v= 2;
			for(int i=2;i<=h;i++){
				if(i%2==0){
					u= u*2;
					v= v*1;
				}
				else{
					u= u*2;
					v= v*4;
					u= u+v;
					v=u;
				}
			}
			if(h%2==0){
				System.out.println(u+v);
			}
			else System.out.println(u);
		}
	}
}
