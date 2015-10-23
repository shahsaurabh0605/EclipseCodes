import java.util.*;

		public class Main {
			 
		    public void printBinaryFormat(int number){
		        int binary[] = new int[25];
		        int index = 0;
		        while(number > 0){
		            binary[index++] = number%2;
		            number = number/2;
		        }
		        for(int i = index-1;i >= 0;i--){
		            System.out.print(binary[i]);
		        }
		    }
		     
		    public static void main(String args[]){
		        Main dtb = new Main();
		        Scanner s= new Scanner(System.in);
		        int num= s.nextInt();
		        dtb.printBinaryFormat(num);
		    }
		}
		//- See more at: http://www.java2novice.com/java-interview-programs/decimal-to-binary/#sthash.H7Nf2wFF.dpuf
		
