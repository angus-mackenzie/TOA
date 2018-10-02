import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Angus Mackenzie
 * @version 23/09/2018
 * Calculates the number of moddable values between N and Z such that (X * Y)%N = Z where X Y are positive integers
 */
public class Modulus {
    /**
     * Returns the value of (X*Y)%N
     * @param x X
     * @param y Y
     * @param N N
     * @return the value
     */
    public static int doMod(int x, int y, int N){
        return (x*y)%N;
    }

    /**
     * Runs the program
     * @param args for commandline arguments
     */
    public static void main(String[] args) {
        ArrayList<int[]> pairs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int Z = Integer.parseInt(sc.nextLine());
        //Checks if the numbers adhere to the constraints
        //1 <= N <= 1000
        //0 <= Z < N
        if(N < 0 || N >1000 || Z <= 0 || Z >=N){
            System.out.println(pairs.size());
            System.exit(0);
        }
        for(int i = 0; i < N;i++) {
            for (int j = 0; j < N; j++) {
                if (doMod(j, i, N) == Z) {
                    int[] pair = {j,i};
                    pairs.add(pair);
                }
            }
        }
        System.out.println(pairs.size());
    }
}
