
#### create binary search tree with sorted array
```JAVA
Node BST(int[] arr){
	return buildBST(arr, 0, arr.length-1);
	
}
Node buildBST(int[] arr, start, end){
	//needs to check if null
	if(start<end) return null;
	int middle =  (start + end) / 2;	
	Node node = new Node(middle);			
	
	node.left = buildBST(arr, start, middle -1);
	
	node.right = buildBST(arr,middle + 1, end);
	
		

	return node;	
}
```



























