public class mergeSortAlgorithm {
	public int[] mergeSortArray;
	public mergeSortAlgorithm(int[] mergeSortArray) {
		this.mergeSortArray = mergeSortArray;
	}
	public void mergeSort(int[] array,int start,int end) {
		if(end-start<2) return;
		int middle=(start+end)/2;
		mergeSort(array,start,middle);
		mergeSort(array,middle,end);
		merge(array,start,middle,end);
		// TODO Auto-generated constructor stub
	}
	public void merge(int[] array,int start,int middle,int end) {
		if(array[middle-1]<array[middle]) return;
		int i=start;
		int j=middle;
		int tempPointer=0;
		int[] temp=new int[end-start];
		while(i<middle && j<end) {
			temp[tempPointer++]=array[i]<array[j]?array[i++]:array[j++];
		}
		System.arraycopy(array, i, array,start+tempPointer, middle-i);
		System.arraycopy(temp, 0, array, start, tempPointer);
		
	}

}
