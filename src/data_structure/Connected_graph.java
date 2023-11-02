package data_structure;

import java.util.*;

public class Connected_graph {
	class Edge{
		int src,dest; 
	}
	//number of vertices and edges
	int vertices,edges;
	
	//num of store all edges
	Edge[] edge;
	Connected_graph (int vertices,int edges) 
	{
		this.vertices=vertices;
		this.edges=edges;
		
		edge=new Edge[edges];
		for(int i=0;i<edges;i++) {
			edge[i]=new Edge();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int noVertices = 4;
		    int noEdges = 5;
		    Graph g = new Graph(noVertices, noEdges);
		    g.edge[0].src=1;
		    g.edge[0].dest=2;
		    
		    g.edge[1].src=1;
		    g.edge[1].dest=3;
		    
		    g.edge[2].src=2;
		    g.edge[2].dest=3;
		    
		    g.edge[3].src=2;
		    g.edge[3].dest=4;
		    
		    g.edge[4].src=3;
		    g.edge[4].dest=4;
		    //print graph
		    for(int i=0;i<noEdges;i++) {
		    	System.out.println(g.edge[i].src + " - " + g.edge[i].dest);
		    }

	}

}
