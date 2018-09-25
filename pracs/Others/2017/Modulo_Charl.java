import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Charl Ritter
 */
public class  Modulo_Charl {
    
    public static void main(String[] args) {
        ArrayList<String> outputs = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int x = keyboard.nextInt();
        
        SquareRootsFinder(outputs, n, x);
        
        System.out.println("");
        for(String output:outputs){
            System.out.print(output+" ");
        }
        System.out.println("");
    }

    private static void SquareRootsFinder(ArrayList<String> outputs, int n, int x) {
        for (int a = 1; a < n; a++) {
            if(x%n == Math.pow(a,2)%n){
                outputs.add(""+a);
            }
        }
    }
    
}
