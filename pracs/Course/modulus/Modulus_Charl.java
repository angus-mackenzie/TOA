
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Charl Ritter
 */
public class  Modulus_Charl {
    
    public static void main(String[] args) {
        ArrayList<String> outputs = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int z = keyboard.nextInt();
        
        PairFinder(outputs, n, z);
        
        System.out.println("");
//        for(String output:outputs){
//            System.out.println(output);
//        }
        System.out.println(outputs.size());
    }

    private static void PairFinder(ArrayList<String> outputs, int n, int z) {
        for (int x = 1; x < n; x++) {
            for (int y = 1; y < n; y++) {
                if(((x*y)%n) == z){
                    outputs.add(x+", "+y);
                }
            }
        }
    }
    
}
