
import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		long count[]= new long[100000];
		ArrayList<Long> arr= new ArrayList<Long>();
		long ans;
		for(int i=2;i<400;i++){
			ans= (i)*(i-1)*(i+1)*(3*i+2)/12;
			arr.add(ans);
		}
		//System.out.println(arr);
		int index = 0;
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			long n= s.nextLong();
			if(n<4){
				System.out.println("0");
				System.out.println("draw");
			}
			else{
				long index1= iterartive(arr,n);
				//System.out.println("index= "+index1);
			 if(index1%2==0){
				 System.out.println(index1);
				 System.out.println("Ketan");
			 }
			 else{
				 System.out.println(index1);
				 System.out.println("Dhruv");
			 }
		}
		}
	}
	/*	public int recursive(int search,int first,int last) {
			int mid= first+ (last-first)/2;
			if(first<=last){
				if(arr.get(mid)>search){
					recursive(search,first,mid-1);
				}
				else if(arr.get(mid)<search){
					recursive(search,mid+1,last);
				}
				else{
					System.out.println(mid+1);
					flag1=1;
				}
			}
			return flag1;
			// TODO Auto-generated method stub
			
		}*/
		public static long iterartive(ArrayList<Long> arr, long search) {
			long first= 0,flag=0;
			long last= arr.size()-1;
			long mid= first+ (last-first)/2;
			int i;
			for( i=0;first<=last;i++){
			//	System.out.println("dcsc");
				if(arr.get((int) mid)>search){
					last= mid-1;
					mid= first+ (last-first)/2;
				}
				else if(arr.get((int) mid)<search){
					first= mid+1;
					mid= first+ (last-first)/2;
				}
				else{
					flag=1;
					return mid+1;
				}
			}
			//System.out.println(i);
			if(flag==0){
				//System.out.println("dsad");
				return mid;
			}
			// TODO Auto-generated method stub
			return 0;
			
		}
		
}


