
public class quickSortAlgorithm {

	public static void main(String[] args) {
		int[] arrayToSort= {20,55,-22,-15,7,1,35,18};

		quickSort(arrayToSort,0,arrayToSort.length);
		for(int i=0;i<arrayToSort.length;i++) {
		System.out.println(arrayToSort[i]);
	}

	}
	public static void mergeSort(int[] input,int start, int end) {
		if(end-start<2)return;
		int middle=(start+end)/2;
		mergeSort(input,start,middle);
		mergeSort(input,middle,end);
		merge(input,start,middle,end);

	}
	public static void merge(int[] input,int start,int middle,int end) {
		if(input[middle-1]<input[middle])return;
		int i=start;
		int j=middle;
		int[] temp=new int[end-start];
		int pointer=0;
		while(i<middle && j<end) {
			temp[pointer++]=input[i]<input[j]?input[i++]:input[j++];
		}
		
		//copy from first pointer to middle and paste in input
		System.arraycopy(input, i, input, start+pointer, middle-i);
		//copy from start to pointer from temp array
		System.arraycopy(temp, 0, input, start, pointer);
		
		
	}
	public static void quickSort(int[] input, int start,int end) {
		if(end-start<2)return;
		int pivotindex=partition(input,start, end);

		quickSort(input,start,pivotindex);
		quickSort(input,pivotindex+1,end);
		
		
	}
	public static int partition(int[] input, int start,int end) {
		int pivot=input[start];
		int i=start;
		int j=end;
		while(i<j) {
			
			
			while(i<j && input[--j]>=pivot);
			input[i]=input[j];
			
			while(i<j && input[++i]<=pivot);
			input[j]=input[i];
			
		}
		input[j]=pivot;
		return j;
		
	}

}
