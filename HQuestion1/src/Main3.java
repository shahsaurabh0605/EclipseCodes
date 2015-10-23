import java.util.*;
public class Main3 {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int arr1[][]= new int[1000][1000];
		long n= s.nextLong();
		long q= s.nextLong();
		for(int p=0;p<q;p++){
			int a= s.nextInt();
			int b= s.nextInt();
			int c= s.nextInt();
			if(a==3){
				if(arr1[b][c]== -1 || arr1[c][b]== -1){
					System.out.println("-1");
				}
				else{
				arr1[b][c]=1;
				arr1[c][b]=1;
				for(int i=1;i<=n;i++){
					if(arr1[i][b]==1){
						arr1[i][c]= 1;
						arr1[c][i]= 1;
					}
					if(arr1[i][c]==1){
						arr1[i][b]=1;
						arr1[b][i]=1;
					}
				}
				}
			}
			else if(a==4){
				if(arr1[b][c]==1 || arr1[c][b]== 1){
					System.out.println("-1");
				}
				else{
					arr1[b][c]= -1;
					arr1[c][b]= -1;
					for(int i=1;i<=n;i++){
						if(arr1[b][i]==1){
							arr1[i][c]= -1;
							arr1[c][i]= -1;
						}
					}
				}
			}
			else if(a==1){
				if(arr1[b][c]==1 || arr1[c][b]==1){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
			}
			else {
				if(arr1[b][c]==-1 || arr1[c][b]==-1){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
			}
		}
	}
}