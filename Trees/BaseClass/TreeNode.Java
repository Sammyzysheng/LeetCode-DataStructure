
public class TreeNode {
	private int data;
	private TreeNode leftNode;
	private TreeNode rightNode;
	public TreeNode(int data) {
		this.data=data;
	}


	public TreeNode get(int value) {
		if(this.data == value) {
			return this;
		}
		else if(this.data> value) {
			if(this.leftNode!=null) { 
				return this.leftNode.get(value);
			}
		}
		else {
			if(this.rightNode!=null) {
				return this.rightNode.get(value);
				
			}
		}
		return null;
	}
	public TreeNode max() {
		if(this.rightNode!=null) {
			return this.rightNode.max();
		}
		else {
			return this;
		}
	}
	public TreeNode min() {
		if(this.leftNode!=null) {
			return this.leftNode.min();
		}
		else {
			return this;
		}
	}
	public void insert(int value) {
		if(this.data==value) {
			return;
		}
		else if(this.data>value) {
			if(this.leftNode==null) {
				this.leftNode=new TreeNode(value);
			}
			else {
				this.leftNode.insert(value);
			}
		}
		else {
			if(this.rightNode==null) {
				this.rightNode=new TreeNode(value);
			}
			else {
				this.rightNode.insert(value);
			}
		}
	}
	public void traversePreOrder() {
		System.out.println("Data= "+this.data);
		if(this.leftNode!=null) {
			this.leftNode.traversePreOrder();
		}
		if(this.rightNode!=null) {
			this.rightNode.traversePreOrder();
		}
	}
	public void traversePostOrder() {
		
		if(this.leftNode!=null) {
			this.leftNode.traversePostOrder();
		}
		if(this.rightNode!=null) {
			this.rightNode.traversePostOrder();
		}
		System.out.println("Data= "+this.data);
	}
	public void traverseInOrder() {
		if(this.leftNode!=null) {
			this.leftNode.traverseInOrder();
		}
		System.out.println("Data= "+this.data);
		if(this.rightNode!=null) {
			this.rightNode.traverseInOrder();
		}
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}
	public TreeNode getRightNode() {
		return rightNode;
	}
	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}
	

}
