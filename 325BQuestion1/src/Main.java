import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> arr= new ArrayList<>();
		int n= s.nextInt();
		for(int i=0;i<n;i++){
			arr.add(s.nextInt());
		}
		int temp=0;
		for(int i=0;i<n;){
			if(arr.get(i)!=1){
				arr.remove(i);
				temp=1;
				//System.out.println(i);
			}
			if(arr.size()==0 || arr.get(i)==1) break;
			if(temp==0){
				i++;
			}
		}
		int m= arr.size();
		temp=0;
		Collections.reverse(arr);
		for(int j=0;j<m;){
			if(arr.get(j)!=1){
				arr.remove(j);
				temp=1;
			}
			if(arr.size()==0 || arr.get(j)==1) break;
			if(temp==0){
				j++;
			}
		}
		//System.out.println(arr);
		int size= arr.size();
		int flag=0,count=0,flag1=0;
		for(int i=0;i<arr.size();i++){
			if(arr.get(i)==0 && flag==1){
				if(flag1==1){
					count=count+1;
				}
				else{
					count= count+2;
					flag1=1;
				}
				
			}
			if(arr.get(i)==0){
				if(flag==0){
					flag=1;
					flag1=0;
				}
			}
			if(arr.get(i)==1){
				if(flag==1)
				flag=0;
			}
		}
		System.out.println(size- count);
	}
}
