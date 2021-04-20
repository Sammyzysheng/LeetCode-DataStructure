# Divide and Conquer

## MergeSort Algorithm
### Dividing phase
divide each subarray into two array base on start and end index
continue to divide newly created two subarrays
sort subarrays and merge them

### Merge phase
Need an extra space to store a temporary sorted array consistes of two subarrays
use two pointer to compare the elements in eahc subarray 
if any of subarray has reminder, copy and paste reminder into original array
copy and paste temporary array (sorted) to original array

## QuickSort Algorithm
### Conquer Phase
choose a pivot index(eg.start index)  
keep all left elements smaller than pivot and all right elements bigger than pivot
set two pointer, stop when case matches above situation, starting at pivot, replace element at the pointer with element at the other pointer(swap left and right side elements)

### Dividing phase
take pivot as the end of one subarray and beginning of the other subarray
continue to set pivot and reorder left side right side elements until there is only one element left on each side
