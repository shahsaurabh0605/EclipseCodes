import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int flag=0;
		while(flag!=1){
			int flag1=0;
			ArrayList<Integer> arr= new ArrayList<>();
			int count=0;
			int n= s.nextInt();
			if(n==0) flag=1;
			else{
				for(int i=0;i<n;i++){
					arr.add(s.nextInt());
				}
				Collections.sort(arr);
				for(int i=0;i<n-2;i++){
					int k= i+2;
					for(int j=i+1;j<n;j++){
						while(k<n && arr.get(i)+ arr.get(j)>=arr.get(k))
							k++;
						//System.out.println(k);
						count+= n-k;
					}
				}
				System.out.println(count);
			}	
		}
	}
}
