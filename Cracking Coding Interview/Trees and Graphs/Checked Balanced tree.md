```JAVA
//height of a node is determined by the higher one of its left right nodes
//check balanced tree on a node : whether height of left and right nodes differ more than 1
//if subnode not balanced, then tree node is not balanced

boolean isBalanced(TreeNode root){

	if(root==null)return true;
	if(!isBalanced(root.left) || !isBalanced(root.right))return false;
	int left = getHeight(root.left);
	int right= getHeight(root.right);
 	if(left - right > 1 || right -left > 1) return false;
	return true;
}
int getHeight(TreeNode node){
	if(node == null)return 0;
	return 1+(getHeight(node.left)>getHeight(node.right)?getHeight(node.left):getHeight(node.right));
}
```
