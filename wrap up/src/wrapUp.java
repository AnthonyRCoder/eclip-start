import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class wrapUp {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		readinput();
	}


	public static  Scanner in ;
	public static PrintWriter pw;

	
	
	
	public static void readinput()
	{
	
		try{
			
			File inputFile = new File ("TournamentFile.csv");	
			 in = new Scanner(inputFile);
		
		  }
		
		catch (IOException e)
		  {
			System.out.println("The file cannot be found" + e);
		  }
		
		count_highest_score();
   }
	
		public static void count_highest_score()
		{
			double counter = 0;
			String fname = "";
			String sname = "";
	   
	   while(in.hasNext()){
		   
		String people = in.next(); 
		String[] parts = people.split(",");  
		
		if(Double.parseDouble(parts[2])>counter){
			
			counter = Double.parseDouble(parts[2]);
			fname = parts [0];
			sname = parts[1];
	   		}	
	   }
	   
	   readoutput(fname,sname,counter);
	}
	     
   		
   		public static void readoutput(String f, String s, double score)
   		{
   			try{
   				
   				pw = new PrintWriter("Output.txt");	
   				
   				System.out.println("The winner is " +   f  + " " +  s  +" and score is " + score );
   				pw.println("The winner is " +   f  + " " +  s  +"  and score is  " + score );
   				
   				pw.flush();
   			
   				}catch(FileNotFoundException e)
   					{
   				e.printStackTrace();
   					}
   		}
   		

}


