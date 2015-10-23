import java.util.*;
public class Main {
	static int  row=0;
	static int column=0;
	static int result[]= new int[10000];
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int num= s.nextInt();
		int arr[][]= new int[5000][5000];
		for(int i=2;i<=(2*num);i++){
			for(int j=1;j<=i-1;j++){
				arr[i][j]= s.nextInt();
			}
		}
		for(int k=0;k<num;k++)
			calculate(num,arr);
		
		for(int q=0;q<(2*num);q++){
			System.out.print(result[q]+" ");
		}
	}
	public static void calculate(int num,int arr[][]){
		int max= Integer.MIN_VALUE;
		for(int i=2;i<=(2*num);i++){
			for(int j=1;j<=(2*num-1);j++){
				if(arr[i][j]>max){
					max= arr[i][j];
				}
			}
		}
		for(int i=2;i<=(2*num);i++){
			for(int j=1;j<=(2*num-1);j++){
				if(arr[i][j]==max){
					row= i;
					column= j;
					break;
				}
			}
		}
		result[column-1]= row;
		result[row-1]= column;
		for(int j=1;j<=(2*num-1);j++)
			arr[row][j]=0;
		for(int i=2;i<=(2*num);i++)
			arr[i][column]=0;
		for(int i=2;i<=(2*num);i++)
			arr[i][row]=0;
		for(int j=1;j<=(2*num-1);j++)
			arr[column][j]=0;
}
}
