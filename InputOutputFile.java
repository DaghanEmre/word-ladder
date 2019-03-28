import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class InputOutputFile {

	public static void I_O_File(File dictionFile, File inpFile, File outFile, ArrayList<GraphNode> Graph) 
	{
		BufferedReader dictionary = null;	
		BufferedReader input = null;
		BufferedWriter output = null;
		
		String line = null;
		
		try{
			
			dictionary = new BufferedReader(new FileReader(dictionFile));
			input = new BufferedReader(new FileReader(inpFile));
			output = new BufferedWriter(new FileWriter(outFile));
			
			while((line = dictionary.readLine()) != null){
				Main.setGraphNodes(Graph, line);
			}
			
			/*That function create links between two nodes which both have one same letter */
			Main.setNodesLink(Graph);
			
			System.out.println(Graph.get(156).getWord());
			System.out.println(Graph.get(156).getNeighbours().get(5).getWord());
			
		/*	for(GraphNode node:Graph){
				System.out.println(node.getWord());
			}   	*/
			
		}		
		
		catch(IOException e){
			e.printStackTrace();
		}
		
		finally{
			try{
				if((dictionary != null) && (input != null) && (outFile != null))
				{
					dictionary.close();
					input.close();
					output.close();
				}
			}catch (IOException ex){
				ex.printStackTrace();
			}
		}
		
	}
	
	
	
}
