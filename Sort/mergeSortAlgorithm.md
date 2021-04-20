### Divide and Conquer

## Dividing phase
divide each subarray into two array base on start and end index
continue to divide newly created two subarrays
sort subarrays and merge them

## Merge phase
Need an extra space to store a temporary sorted array consistes of two subarrays
use two pointer to compare the elements in eahc subarray 
if any of subarray has reminder, copy and paste reminder into original array
copy and paste temporary array (sorted) to original array

