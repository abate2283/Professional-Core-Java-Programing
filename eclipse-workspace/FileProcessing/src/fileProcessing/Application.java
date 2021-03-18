package fileProcessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
*/
public class Application {

	public static void main(String[] args) throws FileNotFoundException {      // throws FileNotFoundException {
		
		File file = new File("mindex.txt");
		Scanner input = new Scanner(file);
		
		while(input.hasNextLine()) {
			String myLine = input.nextLine();
			System.out.println(myLine);
		}
		
		
		
		
	/*	
		File file = new File("newFile.txt");
		Scanner input = new Scanner(file);
		
		while(input.hasNextLine()){
			String line = input.nextLine();
			System.out.println(line);
		}
		
		input.close();
		*/
	}
}


