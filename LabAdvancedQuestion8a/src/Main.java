import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int a[]= new int[100];
		int b[]= new int[100];
		int c[]= new int[100];
		int len= s.nextInt();
		for(int i=0;i<len;i++){
			a[i]= s.nextInt();
		}
		int max= Integer.MIN_VALUE;
		for(int i=0;i<len;i++){
			if(a[i]>max){
				max= a[i];
			}
		}
		int k= max;
		for(int i=0;i<=k;i++){
			c[i]=0;
		}
		for(int i=0;i<len;i++)
			c[a[i]]++;
		
		for(int i=1;i<=k;i++)
			c[i]= c[i]+ c[i-1];
		/*for(int i=0;i<=k;i++){
			System.out.print(c[i]);
		}
		System.out.println();*/
		for(int i=len-1;i>=0;i--){
			b[c[a[i]]]= a[i];
			c[a[i]]= c[a[i]]-1;
		}
		for(int i=1;i<=len;i++){
			System.out.print(b[i]+" ");
		}
	}
}
