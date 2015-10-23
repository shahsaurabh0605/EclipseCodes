import java.util.*;
class Main1 {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> a= new ArrayList<Integer>(); 
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int num= s.nextInt();
			int k= s.nextInt();
			for(int i=0;i<num;i++){
				a.add(s.nextInt());
			}
			Collections.sort(a);
			int sum,sum1;
			if(k<= num/2){
				sum=0;
				for(int i=0;i<k;i++)
					sum= sum+ a.get(i);
				sum1=0;
				for(int j=k;j<a.size();j++)
					sum1= sum1+ a.get(j);
				System.out.println(Math.abs(sum-sum1));
			}
			else{
				sum=0;
				for(int i=0;i<num-k;i++)
					sum= sum+ a.get(i);
				sum1=0;
				for(int j=num-k;j<a.size();j++)
					sum1= sum1+ a.get(j);
				System.out.println(Math.abs(sum-sum1));
			}
			sum=0;
			sum1=0;
			a.clear();
		}
	}
}
