import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		s.nextLine();
		for(int p=0;p<t;p++){
		//	ArrayList<Integer> arr= new ArrayList<>();
			String str= s.nextLine();
			int count=1,max=0;
			int j=0,flag=0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)=='.'){
					flag=1;
					count++;
				}
				if(str.charAt(i)=='#'){
					if(flag==1){
						if(count> max){
							max= count;
							flag=0;
							j++;
						}
					}
					count=1;
				}
			}
			System.out.println(j);
		}
	}
}
