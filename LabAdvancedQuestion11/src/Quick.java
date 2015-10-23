
public class Quick {
	int countSwaps=0;
	int countComp=0;
	public void quickSort(int[] arr, int p, int r) {
		if(p<r){
			int q= Partition(arr,p,r);
			quickSort(arr,p,q-1);
			quickSort(arr,q+1,r);
		}
		// TODO Auto-generated method stub
	}

	private int Partition(int[] arr, int p, int r) {
		int pivot= arr[r];
		int i= p-1;
		for(int j=p;j<=r-1;j++){
			countComp++;
			if(arr[j]<=pivot){
				i++;
				if(arr[j]!= arr[i]){
					countSwaps++;
					int t= arr[j];
					arr[j]= arr[i];
					arr[i]= t;
				}
			}
		}
		int t= arr[r];
		arr[r]= arr[i+1];
		arr[i+1]= t;
		countSwaps++;
		// TODO Auto-generated method stub
		return i+1;
	}
	
}
