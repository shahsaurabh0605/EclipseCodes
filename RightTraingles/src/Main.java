import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int count=0;
		int t= s.nextInt();
		for(int i=0;i<t;i++){
			int a1= s.nextInt();
			int a2= s.nextInt();
			int b1= s.nextInt();
			int b2= s.nextInt();
			int c1= s.nextInt();
			int c2= s.nextInt();
			float d1= (float) ((float) Math.pow((a1-b1),2)+  Math.pow((a2-b2),2));
			//System.out.println( Math.pow((a1-b1),2)+  Math.pow((a2-b2),2));
			float d2= (float) ((float) Math.pow((b1-c1),2)+  Math.pow((b2-c2),2));
			float d3=  (float) ((float) Math.pow((c1-a1),2)+  Math.pow((c2-a2),2));
			//System.out.println("d1= "+d1+" d2= "+d2+" d3= "+d3);
			float max;
			if(d1>=d2){
				max= d1;
			}
			else max= d2;
			
			if(d3>max) max= d3;
			if(d1==max){
				if(d1== d2+ d3) 
					count++;
			}
			else if(d2==max){
				if(d2== d1+d3)
					count++;
			}
			else{
				if(d3== d1+d2)
					count++;
			}
		}
		System.out.println(count);
	}
}
