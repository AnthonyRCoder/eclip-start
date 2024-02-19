


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Scanner;

public class IOfileChallenge {

		//public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			
	/**	try{
				
				File inputFile = new File("Input.txt");
				Scanner in = new Scanner(inputFile);
				PrintWriter out = new PrintWriter("Output.txt");
				
				
				double total = 0;
				int count = 0;
				while(in.hasNextDouble()){
				
					double value = in.nextDouble();
					count++;
					out.printf("%15.2f\n", value);
					total = total + value;
				}	
				
				out.printf("Total: 8..2f", total);
				
				in.close();
				out.close();
				
			  }
			
			catch (FileNotFoundException e){
				
				System.out.print("The file cannot be found" + e);
				
			}
		//}
		**/
		
		public static Scanner in; 
		public static PrintWriter pw;	
		
		
		public static void readInput(){
			
			try{
			
			File inputFile = new File("Input.txt");
			 in = new Scanner(inputFile);
			
			}
			catch (IOException e){
				
				System.out.print("The file cannot be found" + e);
			
			}
			
			countOccurrences();
		}
		
		
		
		public static void countOccurrences(){
			
			
			double total = 0;
			int counter = 0;
			while(in.hasNextDouble()){
			
				double value = in.nextDouble();
				total = total+value;
				counter++;
			}
		
			sendOutput(counter,total);	
				
			}
			
			public static void sendOutput(int occurrencies,double total){
				
				try{
					
					pw = new PrintWriter("Output.txt");
					
					System.out.println("The number of values was: " + occurrencies + " The sum total");
					pw.println("The number of values was: " + occurrencies + " The sum total");
					
					pw.flush();
				}catch (FileNotFoundException e){
					
					e.printStackTrace();
				}
			}
				
				
				public static void main(String[] args){
					
					readInput();
				}
		}

