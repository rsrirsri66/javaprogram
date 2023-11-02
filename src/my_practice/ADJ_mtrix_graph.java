package my_practice;

public class ADJ_mtrix_graph {
	private boolean adjmatrix[][];
	private int numVertices;
	
	public ADJ_mtrix_graph(int numVertices) {
		this.numVertices=numVertices;
		adjmatrix =new boolean[numVertices][numVertices];
	}
	
	//add edge
	public void addedge(int i,int j) {
		adjmatrix[i][j]=true;
		adjmatrix[j][i]=true;
	}
	
	//print matrix
	public String toString() {
		StringBuilder s=new StringBuilder();
		for(int i=0;i<numVertices;i++) {
			s.append(i+": ");
			for(boolean j: adjmatrix[i]) {
				s.append((j ? 1:0)+" ");
			}
			s.append("\n");
		} 
		return s.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ADJ_mtrix_graph g=new  ADJ_mtrix_graph(5);
		 g.addedge(0, 1);
		 g.addedge(0, 2);
		 g.addedge(1, 4);
		 g.addedge(1, 3);
		 g.addedge(2,3);
		 g.addedge(3, 4);
		 
		 System.out.println(g.toString()); 

	}

}
