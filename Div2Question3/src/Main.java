import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> arr= new ArrayList<>();
		ArrayList<Integer> arr1= new ArrayList<>();
		int count[]= new int[100000];
		int n= s.nextInt();
		for(int i=0;i<n*n;i++){
			arr.add(s.nextInt());
		}
		for(int i=0;i<n*n;i++){
			arr1.add(arr.get(i));
		}
		for(int i=0;i<n*n;i++){
			for(int j=i+1;j<n*n;j++){
				if(arr.get(i)==arr.get(j)){
					count[i]++;
					arr.remove(arr.indexOf(arr.get(i)));
				}
				if()
			}
		}
	}
}
