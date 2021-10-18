public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
	    return nums;
    }
     public void quickSort(int[] nums, int start, int end){
         if(start>=end)return;
         int pivot = partition(nums,start,end);
         if(start<pivot-1) quickSort(nums,start,pivot-1);
         if(pivot<end)quickSort(nums,pivot,end);
     }

    public int partition(int[] nums, int start, int end){
        
        int pivot = (start+end)/2;
        int pivotValue = nums[pivot];
        int i = start; 
        int j = end;
        while(i<=j){
            while(nums[i]<pivotValue)i++;
            while(nums[j]>pivotValue)j--;
            if(i<=j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                //System.out.println("swap:"+nums[j]+","+nums[i]);
                i++;
                j--; 
                
            }
                     
        }
        // print(nums);
        //System.out.println(i);
        return i;


    }
    public void print(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }



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
