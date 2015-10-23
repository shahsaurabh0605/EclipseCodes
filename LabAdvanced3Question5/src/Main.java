import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the num of total employees");
		int num=s.nextInt();
		Queue a1=new Queue(num);
		Queue a2=new Queue(num);
		System.out.println("enter all the employee priorities");
		for(int i=0;i<num;i++){
			a1.insert(s.nextInt());
		}
		
		
		System.out.println("1==>extract employee of highest priority");
		while(s.hasNext()){
			int q=s.nextInt();
			if(q==1){
				int max=0;
				while(!a1.isempty()){
					int x=a1.delete();
					
					if(x>max){
						max=x;
					}
					a2.insert(x);
				}
				
				while(!a2.isempty()){
					
					int x=a2.delete();
					if(x!=max){
						a1.insert(x);
					}
					else
						System.out.println(x);
				}
				
			}
		}
	}

}
