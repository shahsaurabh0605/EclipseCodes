import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		String str[]= new String[100];
		String str1[]= new String[100];
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int n= s.nextInt();
			int k= s.nextInt();
			for(int i=0;i<n;i++){
				str[i]= s.next();
			}
			for(int i=0;i<k;i++){
				int l= Integer.parseInt(s.next());
					str1[i]= s.nextLine();
			}
			//System.out.println(str1[1]);
			int flag=0;
			for(int i=0;i<n;i++){
				for(int j=0;j<k;j++){
					if(str1[j].contains(str[i])){
						System.out.print("YES ");
						flag=1;
						break;
					}
				}
				if(flag==0) System.out.print("NO ");
				flag=0;
			}
			System.out.println();
		}
	}
}
