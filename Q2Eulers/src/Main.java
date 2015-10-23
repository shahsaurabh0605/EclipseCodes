import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int arr[]= new int[100000];
		int t= s.nextInt();
		for(int p=0;p<t;p++){
			int num= s.nextInt();
			for(int i=0;i<num;i++){
				arr[i]= s.nextInt();
			}
			for(int i=1;i<=10000;i++){
				int ans= totient(i);
				if()
			}
		}
	}
public static int totient(int num){ //euler's totient function calculator. returns totient
    int count=0;
    for(int a=1;a<num;a++){ //definition of totient: the amount of numbers less than num coprime to it
      if(GCD(num,a)==1){ //coprime
        count++;
      }
    }
    return(count);
 }
public static int GCD(int a, int b){ //faster euclidean algorithm-see GCD for explanation
    int temp;
    if(a<b){
      temp=a;
      a=b;
      b=temp;
    }
    if(a%b==0){
      return(b);
    }
    return(GCD(a%b,b));
  }
}