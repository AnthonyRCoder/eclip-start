
public class cubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double result1= cubeVolume(2);
		 double result2= cubeVolume(10);
		 double result3= cubeVolume(3);
		 
		 System.out.println("A cube with sidelength 2 has volume " + result1);
		 System.out.println("A cube with side length 10 has volume " + result2);
		 System.out.println("A cube with side length 3 has volume " + result3);
	}
	
	/**
	 * Computes the volume of a cube.
	 * @param sideLength the side length of the cube
	 * @return the volume 
	 */
	public static double cubeVolume(double sideLength){
		double volume = sideLength * sideLength*sideLength;
		return volume;
	}
	//method that will calculate cbe volume set up to take 3 input parameters
	public static double areaVolume(double length,double breadth, double height){
		double volume = length * breadth*height; // calculation performed using input parame
		return volume; // return variable containingresult of calculation
	}//end 
}
