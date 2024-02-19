import java.util.Scanner;
public class array {

    public  static void main(String[] args){

        final int LENGTH =10;
        double[] value = new double[LENGTH];
        int currentSize = 0;

        System.out.println("Please enter values, Q to quit");
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble() && currentSize < value.length) {

            value[currentSize] = in.nextDouble();
            currentSize++;

        }

        double largest = value[0];
        for (int i = 1; i < currentSize; i++) {


            if (value[i] > largest) {

                largest = value[i];
            }

        }

        System.out.println("largest numder"largest);
    }


}
