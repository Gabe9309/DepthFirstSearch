package DepthFistSearch;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		Vertex v = new Vertex("1");
		Vertex v2 = new Vertex("3");
		Vertex v3 = new Vertex("2");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		Vertex v6 = new Vertex("6");
		Vertex v7 = new Vertex("7");
		
		List<Vertex> list = new ArrayList<>();
		
		v.addNeighbour(v2);
		v2.addNeighbour(v);
		v3.addNeighbour(v4);
		v4.addNeighbour(v2);
		v5.addNeighbour(v);
		v6.addNeighbour(v5);
		v7.addNeighbour(v6);
		
		list.add(v);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		list.add(v5);
		list.add(v6);
		list.add(v7);
		
		DFS dfs = new DFS();
		dfs.dfs(list);
	}

}
