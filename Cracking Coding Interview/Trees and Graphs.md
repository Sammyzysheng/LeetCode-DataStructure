#### Detemine if two vertice in graph has a route

``JAVA
//breath-first search
bool hasRoute(Node from, Node to, Graph g)
{
	if(from == to) return true;
	Map<Node,bool> visited = new Map<Node,bool>();
	for(Node node : g.getNodes()){
		visited.put(node,false);

	}
	Queue<Node> q= new Queue<Node>();
	q.enqueue(from);
	while(!queue.isEmpty()){
		
		
		Node visiting =  q.dequeue();
		
		for(Node node : visting.getAdjacent()){
			
			if(!visited.get(node)){
				if(visiting == to) return true;
				visited.put(node,true);
				q.enqueue(node);
			}

		}

	}
	return false;
	
}
//depth-first search

bool hasRoute(Node from, Node to, Graph g){
	if(from == to) return true;

	Map<Node,bool> visited = new Map<Node,bool>();
	for(Node node : g.getNodes()){
		visited.put(node,false);

	}
	for(Node node in from.getAdjacent()){
		if(node == to) return true;
		if(!visited.get(node)){
			if(hasRoute(node,to,g)){return true;}
			visited.put(node,true);
		}

		
	}
	return false;

}

```
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



























