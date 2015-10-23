import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> arr= new ArrayList<>();
		int n= s.nextInt();
		for(int i=0;i<n;i++){
			arr.add(s.nextInt());
		}
		int piece= 0,flag=0,count1=0;
		for(int j=0;j<n && flag==0;j++){
			for(int i=0;i<n;i++){
				if(arr.get(i)<=piece){
					arr.set(i, 2*n);
					piece++;
				}
				if(piece==arr.size()){
					flag=1;
					break;
				}
			}
			count1++;
			for(int i=n-1;i>=0 && flag==0;i--){
				if(arr.get(i)<=piece){
					arr.set(i, 2*n);
					piece++;
				}
				if(piece==arr.size()){
					count1++;
					flag=1;
					break;
				}
			}
			if(flag==0){
				count1++;
			}
		}
		System.out.println(count1-1);
	}
}
