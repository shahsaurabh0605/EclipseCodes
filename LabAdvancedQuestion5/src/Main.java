import java.util.*;
public class Main {
	static int len,len1,max,depth;
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		len= s.nextInt();
		int arr[]= new int[len];
		len1= len;
		for(int i=0;i<len;i++)
			arr[i]= s.nextInt();
		int arr1[][]= getOutputTree(arr);
		int SecondMax= getSecondMax(arr1);
		System.out.println(SecondMax);
	}

	private static int getSecondMax(int tree[][]) {
		int adjleft,adjright = 0;
		int index=0;
		int max2= Integer.MIN_VALUE;
		for(int i=depth-2;i>=0;i--){
			adjleft= tree[i][index*2];
			if(tree[i].length-1>= (index*2)+1){
				adjright= tree[i][(index*2)+1];
			}
			else{
				adjright= -1;
				index= index*2;
				continue;
			}
			if(max==adjleft){
				max2= Math.max(adjright, max2);
				index= index*2;
			}
			else{
				max2= Math.max(adjleft,max2);
				index= index*2 + 1;
			}
		}
		return max2;
	}

	private static int[][] getOutputTree(int[] arr) {
		depth= (int) (Math.ceil(Math.log(len)/Math.log(2))+1);
		int OutputTree[][]= new int[depth+1][];
		OutputTree[0]= arr;
		int currentRow[]= OutputTree[0];
		int nextRow[]= null;
		for(int i=1;i<depth;i++){
			nextRow = getNextRow(currentRow);
			OutputTree[i]= nextRow;
			currentRow= nextRow;
		}
		max= nextRow[0];
		return OutputTree;
	}
	public static int[] getNextRow(int[] currentRow){
		int temp[]= new int[(int) Math.ceil(len1/2)+1];
		int j=0,i=0;
		while(i<len1){
			if(i<len1-1){
				temp[j]= Math.max(currentRow[i],currentRow[i+1]);
				i=i+2;
				j++;
			}
			else{ 
				temp[j]= currentRow[i];
				i++;
				j++;
			}
		}
		len1= (int) Math.ceil(len1/2);
		return temp;
	}
}
