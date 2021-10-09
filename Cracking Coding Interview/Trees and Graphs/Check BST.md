### wrong answer
```JAVA
//check if BT is BST left < root < right
//if subtree not BST
//a flag to return false once find subtree not BST

boolean checkIfBST(TreeNode node){
	if(node==null)return true;
	if(!checkIfBST(node.left) || !checkIsBST(node.right))return false;
	if(node.left!=null && node.left.val > node.val)return false;
	if(node.right!=null && node.right.val >= node.val)return false;
	return true;
}
```
incorrect thought that BST only has to be left node < root < right \
Should be all left <= root < all right \
solution 1: inorder traversal\
left -> node -> right\
```JAVA
TreeNode lastNode = null;
boolean checkIfBST(TreeNode node){
	if(node==null)return true;
	if(!checkIfBST(node.left))return false;
  //measure if later node larger than last node
	if(lastNode != null && lastNode.val > node.val)return false;
	lastNode=node;
 	if(!checkIsBST(node.right))return false;

	return true;
}
```
