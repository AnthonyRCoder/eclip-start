import java.util.Scanner; 
public class arrayRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		//task1
		double[]values1 = {2,15,36,49,12,18,92,1,13,87};
		
		//task2
		double[]values = new double[10]; 
		
		//tack3
		for(int i = 0; i < values.length; i++){
			values[i]=i;
		}
			
		//task4
		for(int i = 0; i < values.length; i++){
		System.out.println(values[i]);
		}
		System.out.println("end task 4");
		
		
		//task5
		for(int i = 1; i < values1.length; i++) {
		System.out.println(+values1[i]);
		}
			double largest = values1[0];
			for(int i = 1; i < values1.length; i++) {
				if (values1[i] > largest) {
					largest = values1[i];
					}

			sc.close();
			}
			
			System.out.println(" largest numder " + largest);	
	}			
			
}
		
	




