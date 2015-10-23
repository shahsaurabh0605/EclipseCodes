import java.util.*;
class solve{
public static void main(String[] args) {
    String str;
    Scanner sc = new Scanner(System.in);
    int T=sc.nextInt();
    for(int i=0; i<T; i++){
       str= sc.next();
       calculate(str);
    }
}
public static void calculate(String str){
    char first, second; int count=0;
    for(int i=0; i<str.length()-1; i++){
       first= str.charAt(i);
       second= str.charAt(i+1);
       if(first==second){
           count++;
       }
    }
    System.out.println(count);
}
}