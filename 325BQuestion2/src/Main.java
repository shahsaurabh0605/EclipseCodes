import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> arr1= new ArrayList<>();
		ArrayList<Integer> arr2= new ArrayList<>();
		ArrayList<Integer> arr3= new ArrayList<>();
		int n= s.nextInt();
		for(int i=0;i<n-1;i++){
			arr1.add(s.nextInt());
		}
		for(int j=0;j<n-1;j++){
			arr2.add(s.nextInt());
		}
		//Collections.reverse(arr2);
		for(int i=0;i<n;i++){
			arr3.add(s.nextInt());
		}
		int total1[]= new int[10000];
		int sum1=0,sum2=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				sum1= sum1+ arr1.get(j);
			}
			sum1= sum1+ arr3.get(i);
			for(int k=i;k<=n-2;k++){
				sum2= sum2+ arr2.get(k);
			}
			//System.out.println(sum1+" "+sum2);
			total1[i]= sum1+ sum2;
			//System.out.println(sum[i]);
			sum1=0;
			sum2=0;
		}
		int min1= Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(total1[i]<min1){
				min1= total1[i];
			}
		}
		//System.out.println(min1);
		int i=0;
		for(i=0;i<n;i++){
			if(total1[i]==min1){
				break;
			}
		}
		//System.out.println(i);
		
		int total2[]= new int[10000];
		sum1=0;
		sum2=0;
		for(int p=0;p<n;p++){
			if(p==i){
				total2[p]= Integer.MAX_VALUE;
			}
			else{
				for(int j=0;j<p;j++){
					sum1= sum1+ arr1.get(j);
				}
				sum1= sum1+ arr3.get(p);
				for(int k=p;k<=n-2;k++){
					sum2= sum2+ arr2.get(k);
				}
				//System.out.println(sum1+" "+sum2);
				total2[p]= sum1+ sum2;
				//System.out.println(total2[p]+" gghv");
				sum1=0;
				sum2=0;
			}
		}
		int min2= Integer.MAX_VALUE;
		for(int p=0;p<n;p++){
			if(total2[p]<min2){
				min2= total2[p];
			}
		}
		//System.out.println(min2);
		System.out.println(min1+ min2);
	}
}

