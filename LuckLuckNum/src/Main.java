import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int flag=0;
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int num= s.nextInt();
			int temp1= num/7;
			int temp= temp1;
			int mod= num%7;
			if(temp1==0 && num%4==0){
				flag=1;
				System.out.println(temp1*7);
			}
			if(mod==0){
				flag=1;
				System.out.println(temp*7);
			}
			else{
				for(int i=0;i<temp1;i++){
					if(mod% 4==0){
						System.out.println(temp*7);
						flag=1;
						break;
					}
					 mod= mod+ 7;
						temp--;
				}
			}
			if(flag==0){
				System.out.println("-1");
			}
			flag=0;
		}
	}
}
