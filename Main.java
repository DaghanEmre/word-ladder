import java.util.ArrayList;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		File dictionary = new File(args[0]);
		File input = new File(args[1]);
		File output = new File(args[2]);
		
		/*I made an Array list that consists of objects of GraphNode class */
		ArrayList<GraphNode> Graph = new ArrayList<GraphNode>();
		
		InputOutputFile.I_O_File(dictionary, input, output,Graph);
	
	}

	public static void setNodesLink(ArrayList<GraphNode> Graph){
		for( int i=2 ; i < Graph.size() - 1; i++){
			for( int j=2 ; j < Graph.size() - 1; j++){
				if( compareStrings( Graph.get(i).getWord() , Graph.get(j).getWord() ) ){
					
					Graph.get(i).getNeighbours().add(Graph.get(j));
					Graph.get(j).getNeighbours().add(Graph.get(i));
					
				}
			}
		}
		
	}
	
	public static void setGraphNodes(ArrayList<GraphNode> Graph,String word){
		GraphNode node = new GraphNode();
		node.setWord(word);
		node.setParent(null);
		node.setIsCame(0);
		Graph.add(node);
		
	}
	
	public static boolean compareStrings(String firstString, String secondString){
		
		int numberOfDifChar=0;
		
		for(int i=0 ; i < firstString.length(); i++){
			if(firstString.charAt(i) != secondString.charAt(i)){
				numberOfDifChar++;
			}
		}
		
		if(numberOfDifChar == 1)
			return true;
		else
		return false;
	}
	
}
