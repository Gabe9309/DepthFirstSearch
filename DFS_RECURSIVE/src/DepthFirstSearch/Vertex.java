package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String name;
	private List<Vertex> adjacencyList;
	private boolean visited;
	
	Vertex(String name){
		this.name = name;
		adjacencyList = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return (name + " ");
	}
	
	public void addAdjacent(Vertex vertex) {
		this.adjacencyList.add(vertex);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Vertex> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(List<Vertex> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	
}
