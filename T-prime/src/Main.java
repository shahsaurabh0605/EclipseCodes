import java.util.*;
public class Main {
	static int temp[]= new int[1000000];
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		ArrayList<Long> arr= new ArrayList<>();
		for(int i=0;i<n;i++){
			arr.add(s.nextLong());
		}
		Long max= Collections.max(arr);
		sieve(max);
		for(int i=0;i<arr.size();i++){
			int x = arr.get(i);
			if(temp[(arr.get(i)]==-1){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
	public static void sieve(Long n){
		int root= (int)Math.sqrt(n);
		for(int i=2;i<=root;i++){
			if(temp[i]==0){
				for(int j=(i*i);j<=n;j=j+i){
					temp[j]= 1;
					temp[i*i]= -1;
				}
			}
		}
			/*for(int i=2;i<=n;i++){
				if(temp[i]== -1){
					System.out.println(i);
				}
			}*/
	}
}
