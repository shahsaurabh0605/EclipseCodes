
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("size of an array: ");
		int len=s.nextInt();
		int i;
		int a[]=new int[len];
		int range1,range2;
		range1=s.nextInt();
		range2=s.nextInt();
		System.out.println("enter elements of the range "+range1+" to "+range2);
		for(i=0;i<len;i++){
			a[i]=s.nextInt();
		}
		
		int query=s.nextInt();
		Counting_Sort sort=new Counting_Sort(a,range1,range2);
		if(query==1){
			sort.modified_csort();
		}
	}
}
