#### Detemine if two vertice in graph has a route

```Java
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
