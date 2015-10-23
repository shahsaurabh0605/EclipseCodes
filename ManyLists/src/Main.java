import java.util.*;
class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		long n= s.nextInt();
		long m= s.nextInt();
		//ArrayList<ArrayList<Integer>> arr= new ArrayList<ArrayList<Integer>>();
		long arr[][]= new long[1000000][1100000000];
		for(long p=1;p<=m;p++){
			int a= s.nextInt();
			if(a==0){
				long l= s.nextInt();
				long r= s.nextInt();
				long x= s.nextInt();
				for(long i=l;i<=r;i++){
					long count=0;
					for(long j=0;j<p;j++){
						if(x!= arr[(int) i][(int) j]){
							count++;
						}
					}
					if(count==p)
					arr[(int) i][(int)p-1]= x;
				}
				/*for(int i=1;i<=m;i++){
					for(int j=0;j<m;j++){
						//System.out.print(arr[i][j]);
					}
					//System.out.println();
					
				}*/
				//System.out.println();
				//System.out.println();
			}
			else{
				long q=s.nextInt();
				long count1=0;
				//System.out.println(q);
				for(int i=0;i<=m;i++){
					//System.out.print(arr[q][i]);
					if(arr[(int) q][i]!= 0){
						count1++;
					}
				}
				System.out.println(count1);
			}
		}
	}
}