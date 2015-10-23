import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			double arr[]= new double[100000];
			double arr1[]= new double[10000];
			ArrayList<Double> a= new ArrayList<>();
			long count[]= new long[100000];
			long n= s.nextInt();
			for(int i=0;i<n;i++){
				arr[i]= s.nextDouble();
				arr1[i]= s.nextDouble();
			}
			int k=0;
			for(int i=0;i<n-1;i++){
				for(int j=i+1;j<n;j++){
					double x= (arr[i]- arr[j])/(arr1[i]- arr1[j]);
				//	System.out.println(x);
					if(!a.contains(x)){
						a.add(x);
						count[k]++;
						k++;
					}
					else{
						int index= a.indexOf(x);
						count[index]++;
					}
				}
			}
			//float y= (120-30)/(23-80);
			//System.out.println("y= "+y);
			//System.out.println(a);
			long max= Integer.MIN_VALUE;
			//System.out.println(count[0]);
			for(int i=0;i<a.size()+1;i++){
				if(count[i]>max){
					max= count[i];
				}
			}
			int x = 0;
			for(int i=0;i<a.size();i++){
				if(count[i]==max){
					 x= i;
					 break;
				}
			}
			Double slope= a.get(x);
			//System.out.println(slope);
			int temp=0;
			int flag=0;
			for(int i=0;i<n-1 && flag==0;i++){
				for(int j=i+1;j<n;j++){
					double y= (arr[i]- arr[j])/(arr1[i]- arr1[j]);
					if(slope==y){
						temp= i;
						flag=1;
						break;
					}
				}
			}
			int count1=0;
			//System.out.println(temp);
			for(int j=temp+1;j<n;j++){
				double z= (arr[temp]- arr[j])/(arr1[temp]- arr1[j]);
				if(slope==z){
					count1++;
				}
			}
			System.out.println(count1+1);
		}
	}
}