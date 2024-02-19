import java.util.Scanner;

public class loopMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		
		int choice = 0;
		String firstName;
		String lastName;
		do{
			
			System.out.println("You can generate a user by entering !:"
			+ "\n or press zero to exit");
			
			choice = in .nextInt();
			if (choice == 1){
				
				System.out.println("enter your first name:");
				firstName = in.next();
				
				System.out.println("enter your last name:");
				lastName = in.next();
				
				
				String userName = firstName.substring(0, 1) + lastName;
				
				System.out.println("Your user name in " + userName);
			}
		}while(choice != 0);
		in.close();
		
		
		for(int i=10; i>1; i--){
			System.out.println("The value of i is: "+i);
		}
		
		
		
	}

}
