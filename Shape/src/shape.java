import java.util.Scanner;

public class shape {
 
	public static void main (String[] args){
		
	Scanner	scanner = new Scanner(System.in);

	System.out.println("enter the width of the triangle");
	
	double base = scanner.nextDouble();
	
	System.out.println("enter the height of the triangle");
	
	double height = scanner.nextDouble();
	
	double area = (base + height);
	
	System.out.println("Area of triangle is: " + area );
	
	
		

	System.out.println("enter the radius of circle");
	
	double radius = scanner.nextDouble();
	
	double circle = Math.PI * (radius * radius);
	
	System.out.println("The circumference of the circle is: " + circle );
	
	

	
	
	
	int fact = 1;
	
	System.out.println("enter a number between 1 to 10 ");
	int n = scanner.nextInt();
	System.out.println("this factorial is : "+ n + "");
	
	
	for(int i =1; i<=n; i++){
		
		
	fact = fact*i;
	
	if((n - i)>0)
	System.out.println(" x " +(n-i)+"" );
	
	}
	
	System.out.println("answer: " + fact);
	
	scanner.close();
	
	
	}
	
	
}
