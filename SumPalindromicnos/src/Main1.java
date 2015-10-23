import java.util.*;
class Main1 {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		//String reverse= new String();
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int count=0;
			int l= s.nextInt();
			int r= s.nextInt();
			for(int i=l;i<=r;i++){
				String str= Integer.toString(i);
				String reverse= new StringBuffer(str).reverse().toString();
				//System.out.println(str);
				//System.out.println(reverse);
				if(str.equals(reverse)){
					//System.out.println(str);
					count= count+ Integer.parseInt(str);
				}
			}
			System.out.println(count);
			//System.out.println(str);
		}
	}
}