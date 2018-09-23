import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Modulus {
    public static int doMod(int x, int y, int N){
        return (x*y)%N;
    }
    public static void main(String[] args) {
        ArrayList<int[]> pairs = new ArrayList<int[]>();
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int Z = Integer.parseInt(sc.nextLine());
        sc.close();
        //int N = 6;
        //int Z = 3;
        //Constraints
        // 1 <= N <= 10000
        //0 <= Z < N
        if(N <= 0 || N >1000 || Z < 0 || Z >=N){
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
