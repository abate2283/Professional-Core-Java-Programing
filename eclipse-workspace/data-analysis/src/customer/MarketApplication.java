package customer;


import java.io.*;

import processfile.MarketFileData;


public class MarketApplication {

	 public static void main(String[] args){
	
		FileReader file = new FileReader("figures.txt");
		List<HashMap<String, Double>> dataResult = populate.MarketFileData(file.getHeaders(), file.readFileData());
				MarketFileData fileData = new MarketFileData();
				fileData.addData(dataResult);
				fileData.printData();
		
		
	}
public static List<HashMap<String, Double>> populate.MarketFileData(List<String>headers, List<String>lines){
	List<HashMap>String, Double>> dataResult = new ArrayList<>();
}
}


