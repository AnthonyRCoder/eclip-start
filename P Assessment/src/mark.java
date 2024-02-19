import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Scanner;
	
	
public class mark {
	
	public static Scanner in; //declaring in part so that
	public static PrintWriter pw; // like wise with print writer	
	
	//method to read input from file
	//save file in same folder in your workspace as this project
	public static void readinput()
	{
		// try catch to handle file not found exception
		try{

			File inputFile = new File("SupplementaryFile.csv"); //create a link to read document
			
			in = new Scanner(inputFile);// complete scanner with inputfile
			
			}
		catch (IOException e)
		{
			
			System.out.println("The file cannot be found" + e );//will provide correctional information
		}
		
		findHighest();// calls findHighest method
		
	}
		// findHighest method
		public static void findHighest()
		{
			int counter = 0;// local variable to track highest
			String fname = "";// first name of winner
			String sname = "";// surname of winner
			
			while(in.hasNext()){ // method of reading true or false string
				
				String people = in.nextLine(); // reads in text 
				
				String[] parts = people.split(","); // splits text on 
				
				if(Integer.parseInt(parts[2])>counter) 
					{
						//swap number if higher and store names
					counter = Integer.parseInt(parts[2]);
					fname = parts [0];
					sname = parts[1];
			   		}	
			   }//end while
			   
			   readoutput(fname,sname,counter); //send variables to output 
			}
			     
		   		
		   		public static void readoutput(String f, String s, int score)
		   		{
		   			try{
		   				
		   				pw = new PrintWriter("Output.txt");	// create a result file 
		   				//next line writes to output file
		   				System.out.println("The winner is " +   f  + " " +  s  +" and mark is " + score );
		   				pw.println("The winner is " +   f  + " " +  s  +"  and mark is  " + score );
		   				
		   				pw.flush();//extra line may be required to complete
		   			
		   				}catch(FileNotFoundException e)// to do auto - generated catch block
		   					{
		   				e.printStackTrace();// print errors
		   					}
		   		}
		   		
		   		// main method to run program - only calls input method
		 public static void main(String[] args) 
			{
				// TODO Auto-generated method stub
				
					readinput(); // all other methods are called from inside readinput
					
			}  			
	}
	
	

