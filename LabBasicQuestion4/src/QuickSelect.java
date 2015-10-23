import java.util.ArrayList;
import java.util.Collections;
public class QuickSelect {
	int q,flag=0;
	public int QuickSort(ArrayList<Integer> a, int p, int r, int rank) {
		if(p<r && flag==0){
			 q= Quick(a,p,r);
			 /*if((rank-1)==q){
				 flag=1;
			 }*/
			//System.out.println("q= "+ q);
			 if((rank-1)<=q){
				 QuickSort(a,p,q-1,rank);
			 }
			//System.out.println("q= "+ q);
			 else
			QuickSort(a,q+1,r,rank);
			//System.out.println("sda= "+q);
		}
		/*if((rank-1)==q){
			return a.get(q);
		}*/
		return a.get(rank-1);
		// TODO Auto-generated method stub
	}

	public int Quick(ArrayList<Integer> a, int p, int r) {
		//System.out.println("p= "+p+ "q= "+r);
		int pivot= a.get(r);
		int i= p-1;
		for(int j=p;j<=r-1;j++){
			if(a.get(j)<=pivot){
				i++;
				Collections.swap(a, i, j);
				/*int t= a.get(j);
				a.set(j, a.get(i));
				a.set(i, t);*/
			}
		}
		Collections.swap(a, i+1, r);
		/*int t= a.get(i+1);
		a.set(i+1, a.get(r));
		a.set(r, t);*/
		// TODO Auto-generated method stub
		return i+1;
	}
}
