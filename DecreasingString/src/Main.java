import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		char arr[]= new char[1000];
		//String x = null;
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int n= s.nextInt();
			if(n<=25){
				for(int i=n;i>=0;i--){
					arr[i] =(char) ('a'+(char)i);
					//System.out.println(i);
					//System.out.println(d);
					System.out.print(arr[i]);
				}
			}
			else if(n>=26 && n<52){
				for(int i=n;i>=0;i--){
					int d= i%26;
					arr[i] =(char) ('a'+(char)d);
					//System.out.println(i);
					//System.out.println(d);
					if(i==n){
						if(i==51){
							System.out.print("ba");
						}
						else
						System.out.print((char)(arr[i]+1));
					}
					System.out.print(arr[i]);
				}
			}
			else if(n>=52 && n<78){
				for(int i=n;i>=0;i--){
					int d= i%26;
					arr[i] =(char) ('a'+(char)d);
					//System.out.println(i);
					//System.out.println(d);
					if(i==n){
						if(i==76)System.out.print("ba");
						else if(i==77) System.out.print("cba");
						else{
							System.out.print((char)(arr[i]+2));
							System.out.print((char)(arr[i]+1));
						}
					}
					System.out.print(arr[i]);
				}

			}
			else if(n>=78 && n<=100){
				for(int i=n;i>=0;i--){
					int d= i%26;
					arr[i] =(char) ('a'+(char)d);
					//System.out.println(i);
					//System.out.println(d);
					if(i==n){
						System.out.print((char)(arr[i]+3));
						System.out.print((char)(arr[i]+2));
						System.out.print((char)(arr[i]+1));
					}
					System.out.print(arr[i]);
				}

			}
			System.out.println();
		}
	}
}
