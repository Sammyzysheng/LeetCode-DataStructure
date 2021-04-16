
public class Tree {
	private TreeNode root;
	public Tree(TreeNode root) {
		this.root=root;
	}
	public TreeNode get(int value) {
		if(this.root!=null) {
			return this.root.get(value);
		}
		else {
			return null;
		}
	}
	public void delete(int value) {
		//System.out.println("root: "+root.getData());
		this.root=replaceNodeOfDeleted(this.root,value);
	}
	private TreeNode replaceNodeOfDeleted(TreeNode subroot,int value) {
		
		if(subroot==null) {
			return subroot;
		}
		if (subroot.getData()>value) {
			subroot.setLeftNode(replaceNodeOfDeleted(subroot.getLeftNode(),value));	 
		}
		else if (subroot.getData()<value){
			 subroot.setRightNode(replaceNodeOfDeleted(subroot.getRightNode(),value));
		}
		else {
			//node to delete has 0 or 1 children
			if(subroot.getLeftNode()==null) {
				return subroot.getRightNode();
			}
			else if (subroot.getRightNode()==null) {
				return subroot.getLeftNode();
			}
			//have 2 children take largest of leftsub tree
		
			TreeNode max=subroot.getLeftNode().max();
			//set subroot value to largest of leftsub tree
			subroot.setData(max.getData());
			//delete the node with largest of leftsub tree
			subroot.setLeftNode(replaceNodeOfDeleted(subroot.getLeftNode(),subroot.getData()));
		
			
			
		}
		return subroot;
	}
	public TreeNode max() {
		if(this.root!=null) {
			return this.root.max();
		}
		else {
			return null;
		}
	}
	public TreeNode min() {
		if(this.root!=null) {
			return this.root.min();
		}
		else {
			return null;
		}
	}
	public void insert(int value) {
		if(this.root==null) {
			this.root=new TreeNode(value);
		}
		else {
			this.root.insert(value);
		}
	}
	 public void traverseInOrder() {
		 if(this.root!=null) {
			 this.root.traverseInOrder();
		 }
	 }
	public void traversePostOrder() {
		if(this.root!=null) {
			 this.root.traversePostOrder();
		 }
	}
	public void traversePreOrder() {
		if(this.root!=null) {
			 this.root.traversePreOrder();
		 }
	}
	public void printChildren() {
		TreeNode currentLeftNode=this.root;
		TreeNode currentRightNode=this.root;
		while(currentLeftNode.getLeftNode()!=null) {
			System.out.println(currentLeftNode.getLeftNode().getData()+"->");
			currentLeftNode=currentLeftNode.getLeftNode();
		}
		while(currentRightNode.getRightNode()!=null) {
			System.out.println(currentRightNode.getRightNode().getData()+"->");
			currentRightNode=currentRightNode.getRightNode();
		}
	}
}
