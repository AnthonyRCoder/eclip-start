import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This program reads a file with numbers, and writes the numbers to another file, lined up in a column and followed by their total.
 * @author 20234093
 */
public class IOPractice {

	public static void main(String[] args) throws FileNotFoundException {
		// Prompt for the input and output file names
		
		
		Scanner console= new Scanner(System.in);
		System.out.println("Input file: ");
		String inputFileName = console.next();
		System.out.println("Output file: ");
		String outputFileName = console.next();
		
		
		// Construct the Scanner and Print Writer objects for reading and writing
		
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFileName);
		
		// Read the input and write the output
		
		double total = 0;
		
		while(in.hasNextDouble()){
			
			double value = in.nextDouble();
			out.printf("%15.2f", value);	
			total = total+value;
		}
		
		
		out.printf("Total: %8.2f\n", total);
		
		in.close();
		out.close();	
	}

}
