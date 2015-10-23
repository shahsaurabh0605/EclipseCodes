import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int ans=0;
		int t= s.nextInt();
		for(int p=0; p<t; p++){
			int num= s.nextInt();
			int sqrt= (int ) Math.sqrt(num);
			while(true){
				if(num%sqrt==0){
					ans= num/sqrt - sqrt;
					break;
				}
				sqrt--;
			}
			System.out.println(ans);
			}
		}
	}
