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
//        int N = 6;
//        int Z = 3;
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
