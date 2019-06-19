package DepthFirstSearch;

public class App {

	public static void main(String[] args) {
		DFS dfs = new DFS();
		
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		Vertex v6 = new Vertex("6");
		
		v1.addAdjacent(v2);
		v1.addAdjacent(v3);
		v2.addAdjacent(v4);
		v2.addAdjacent(v5);
		v3.addAdjacent(v5);
		v3.addAdjacent(v6);
		
		dfs.dfsRecursive(v1);
		
		
	}

}
