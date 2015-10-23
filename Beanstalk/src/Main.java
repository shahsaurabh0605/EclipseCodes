import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> arr= new ArrayList<>();
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int n= s.nextInt();
			for(int i=0;i<n;i++){
				arr.add(s.nextInt());
			}
			if(n==1 && arr.get(0)==1){
				System.out.println("Yes");
			}
			else{
			int result= 1,flag=0,i,flag2=0,flag3=0;
			for(i=1;i<n;i++){
				int x= result- arr.get(i-1);
				result= 2*x;
				if(i==n-1){
					//System.out.println(result+" "+arr.get(i));
					if(arr.get(i)==result){
						System.out.println("Yes");
					}
					else{
						System.out.println("No");
					}
				}
				else{
					if(arr.get(i)<result){
						
					}
					else if(arr.get(i)==result){
						flag=1;
						x= result- arr.get(i);
						result= 2*x;
						break;
					}
					else{
						flag3=1;
						System.out.println("No");
					}
				}
			}
			if(flag==1 && flag3==0){
				if(i!=(n-1)){
					for(int k=1+1;k<n;k++){
						if(arr.get(k)!=0){
							flag2=1;
							break;
						}
					}
				}
			}
			arr.clear();
		/*	else if(flag==0 && flag3==0){
				System.out.println("Yes");
			}*/
		}
		}
	}
}

