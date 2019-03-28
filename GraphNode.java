import java.util.ArrayList;
public class GraphNode {
	
	private ArrayList<GraphNode> neighbours = new ArrayList<GraphNode>();    
	private GraphNode parent;
	private int isCame;
	private String word;
	
	
	public GraphNode() {
		super();
	}

	public GraphNode(ArrayList<GraphNode> neighbours, GraphNode parent, int isCame, String word) {
		super();
		this.neighbours = neighbours;
		this.parent = parent;
		this.isCame = isCame;
		this.word = word;
	}

	public ArrayList<GraphNode> getNeighbours() {
		return neighbours;
	}

	public GraphNode getParent() {
		return parent;
	}
	
	public void setParent(GraphNode parent) {
		this.parent = parent;
	}
	
	public int getIsCame() {
		return isCame;
	}
	
	public void setIsCame(int isCame) {
		this.isCame = isCame;
	}
	
	public String getWord() {
		return word;
	}
	
	public void setWord(String word) {
		this.word = word;
	} 
	
	
	
	
}
