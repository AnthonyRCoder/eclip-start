import java.util.Scanner;
public class multipes3And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int j = 0; j < args.length; j++) {
            int N = Integer.parseInt(args[j]);
            if (Somme(N) != 0) {
                System.out.println(Somme(N));
            }
        }
    }

    public static int Somme(int Nn) {
        int s = 0;
        for (int i = 0; i < Nn; i++) {
            if (((i % 3) == 0) || ((i % 5) == 0)
                && !(((i % 3) == 0) && ((i % 5) == 0))) {
                s = s + i;
            }
        }
        return (s);
    }

}

