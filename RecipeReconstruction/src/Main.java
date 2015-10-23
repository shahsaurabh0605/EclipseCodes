import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		s.nextLine();
		for(int p=0;p<t;p++){
			String str= new String();
			str= s.nextLine();
			long mod= 10000009;
			long ans=1;
			int n= str.length();
			//System.out.println(str);
			if(n%2==0){
				for(int i=0;i<n/2;i++){
					if(str.charAt(i)=='?' && str.charAt(n-i-1)=='?'){
						ans= (ans*26)%mod;
					}
					else if(str.charAt(i)!=str.charAt(n-i-1)){
						if(str.charAt(i)=='?' || str.charAt(n-i-1)=='?');
						else{
							System.out.println("0");
							break;
						}
					}
				}
				System.out.println(ans);
			}
			else{
				if(n==1){
					if(str.charAt(0)=='?'){
						ans= (ans*26)%mod;
					}
				}
				else{
					int flag=0;
				for(int i=0;i<n/2;i++){
					if(str.charAt(i)=='?' && str.charAt(n-i-1)=='?'){
						ans= (ans*26)%mod;
					}
					else if(str.charAt(i)!=str.charAt(n-i-1)){
						if(str.charAt(i)=='?' || str.charAt(n-i-1)=='?'){
							//flag=1;
						}
						else{
							System.out.println("0");
							flag=1;
							break;
						}
					}
				}
				if(flag==1){
					continue;
				}
				//System.out.println("n= "+n);
				if(str.charAt(n/2)=='?' && flag==0){
					ans= (ans*26)%mod;
				}
				}
				System.out.println(ans);
			}
		}
	}
}