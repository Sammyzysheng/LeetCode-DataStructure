
public class quickSortAlgorithm {

	public static void main(String[] args) {
		int[] arrayToSort= {20,55,-22,-15,7,1,35,18};

		quickSort(arrayToSort,0,arrayToSort.length);
		for(int i=0;i<arrayToSort.length;i++) {
		System.out.println(arrayToSort[i]);
	}

	}
	public static void quickSort(int[] input,int start, int end) {
		if(end-start<2)return;
		int pivot = partition(input,start,end);
		quickSort(input,start,pivot);
		quickSort(input,pivot+1,end);
	

	}
	public static int partition(int[] input,int start,int end) {
		
		int i=start;
		int j=end;
		int pivot=input[start];
		while(i<j){
			while(i<j && input[--j]>=pivot);
			
			input[i]=input[j]
			while(i<j && input[++i]<=pivot);
		
			input[j]=input[i]
		}
		input[j]=pivot;
		return j;
	}
	

}
