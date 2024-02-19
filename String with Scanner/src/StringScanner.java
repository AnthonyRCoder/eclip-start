import java.util.Scanner;


public class StringScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner anthony = new Scanner(System.in);	
		System.out.print("enter");
		
		String name = anthony.next();
		anthony.close();
		
		
		System.out.println(name);
		
		
		String college = "Glasgow Clyde College";
		int n = college.length();
		System.out.print(n);
		
		
	}

}
