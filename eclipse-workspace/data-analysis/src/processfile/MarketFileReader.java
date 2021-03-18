package processfile;
import java.io.*;
import java.util.*;

public class MarketFileReader {
	String filePath = null;
	
	public MarketFileReader(String filePath) {
		this.filePath = filePath;
	}
	public List<String> getHeaders() throws IOException{
	String line = readFirstLine(filePath);
	String [] header = line.split(",");
	List<String>values = new ArrayList<String>();
	values = Arrays.asList(header);
	return values;
		
	
	}
	static String readFirstLine(String path)throws IOException{
		  try (BufferedReader br =
                  new BufferedReader(new FileReader(path))) {
       return br.readLine();
		
	}
}
}
