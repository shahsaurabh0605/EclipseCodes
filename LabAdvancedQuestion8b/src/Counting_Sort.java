
public class Counting_Sort {
	int [] a;
	int k;
	public Counting_Sort(int[] ar,int r1,int r2)
	{
		a=ar;
		k=r2-r1;
	}
	
	public void modified_csort(){
		int b[]=new int[a.length+1];
		int c[]=new int[k+1];
		
		
		int temp[];
		for(int i=0;i<=k;i++){
			c[i]=0;
		}
		
		for(int j=0;j<a.length;j++){
			c[a[j]]++;
		}
		temp=c;
		int maximum=c[0];
		for(int j=1;j<=k;j++){
			if(c[j]>maximum)
				maximum=c[j];
		}
		int d[][]=new int[maximum][k+1];
		int flag=0;
		int add=0;
		int fmins[]=new int[maximum];
		while(empty(temp)==false){
			int min=10000;
			
			for(int j=0;j<=k;j++){
				if(temp[j]!=0 && temp[j]<min)
					min=temp[j];
			}
			//System.out.print("min="+min+" ");
			fmins[flag]=min;
			for(int j=0;j<=k;j++){
				if(temp[j]!=0){
					d[flag][j]=min;
				}
				else
					d[flag][j]=0;
			}
		
			int m;
			for(m=1;m<=k;m++){
				d[flag][m]=d[flag][m]+d[flag][m-1];
			}
			for(int j=0;j<=k;j++){
				d[flag][j]=d[flag][j]+add;
			}
			
			add=d[flag][m-1];
			
			for(int j=0;j<=k;j++){
				if(temp[j]!=0){
					temp[j]=temp[j]-min;
				}
				//System.out.print(temp[j]+" ");
			}
			flag++;
			//System.out.println(empty(temp));
		}
		
		int temp1[]=new int[k+1];
		for(int j=0;j<=k;j++){
			temp1[j]=0;
		}
		
		for(int j=0;j<a.length;j++){
			int count=0;
			temp1[a[j]]++;
			if(temp1[a[j]]>fmins[count]){
				count+=(temp1[a[j]]-fmins[count]);
			}
			b[d[count][a[j]]]=a[j];
		}
		
		for(int j=1;j<a.length+1;j++){
			System.out.print(b[j]+" ");
		}
	}
	
	public boolean empty(int arr[]){
		for(int i=0;i<arr.length && arr[i]==0;i++){
			if(i==arr.length-1)
				return true;
		}
		return false;
	}
	
}

