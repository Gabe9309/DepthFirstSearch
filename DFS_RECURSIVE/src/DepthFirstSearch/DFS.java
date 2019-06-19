package DepthFirstSearch;

public class DFS {
	
	public void dfsRecursive(Vertex v) {
		
		System.out.print(v);
		
		for (Vertex vertex : v.getAdjacencyList()) {
			if(!vertex.isVisited()) {
				vertex.setVisited(true);
				dfsRecursive(vertex);
			}
		}
	}

}
