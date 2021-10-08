#### Orginal solution using queue
```JAVA
//a queue that stores nodes
//a int that record number of nodes at each level
//create a linkedlist at each level
//stops until queue empty

void ListFromBinaryTree(Node root)
{
	Queue<Node> q = new Queue<Node>();
	int noOfNodesCurrentLevel =  1;
	int noOfNodesNextLevel =  0;
	ArrayList<LinkedList<Node>> ll = new ArrayList<LinkedList<Node>>();	
	q.enqueue(root);
	while(!q.IsEmpty()){
		LinkedList<Node> l = new LinkedList<Node>();
		ln = dummyHead;
		while(noOfNodesLevel > 0){
			Node node = q.dequeue();
			noOfNodesLevel--;
			l.add(node);
			if(node.left!=null){
				noOfNodesNextLevel ++;
				q.enqueue(node.left);
			}
			if(node.right!=null){
				noOfNodesNextLevel ++;
				q.enqueue(node.right);
			}
		
		}
		ll.add(l);
		noOfNodesLevel = noOfNodesNextLevel;
	}

}
```
wrong data structure choose: should choose linkedlist<treenode> and arraylist to store linkedlists\
Extra space used for queue : don't have to use queue\
Extra space used to store size of each level: can use size of linkedlist instead

#### Optimal Solution using Depth-First Search
Passing level as a parameter along with TreeNode, create a list at each level\
Add Treenode to list if exists, else ceate new list and add treenode to list\
```JAVA
ArrayList<LinkedList<TreeNode>> createLveelLinkedList(TreeNode root){
  ArrayList<LinkedList<TreeNode>> AL = new ArrayList<LinkedList<TreeNode>>();
  createLevelLinkedList(0,Al,root);
  return Al;
  
  }
 Void createLevelLinkedList(int level, ArrayList<LinkedList<TreeNode>> Al, TreeNode node){
    if(node == null)return;
    if(Al.size()<level){
      LinkedList<TreeNode> ll =  new LinkedList<TreeNode>();
      Al.add(ll);
    }
    Al.get(level).add(node);
    createLevelLinkedList(level+1,Al,node.left);
    createLevellinkedList(level+1,Al,node.right);
                     
  }
 ```
