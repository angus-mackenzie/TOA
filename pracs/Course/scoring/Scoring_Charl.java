
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Charl Ritter
 */
public class Scoring_Charl {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = keyboard.nextInt();
        for(int i=0;i<n;i++){
            list.add(keyboard.nextInt());
        }
        int t = keyboard.nextInt();
        
        ArrayList<Integer> outputs = new ArrayList<>();
        Calculate(list, outputs, 1, 0);
        
        System.out.println("");
        int max = 0;
        for (int output:outputs){
            if(output>max && output<t){
                max=output;
            }
        }
        System.out.println(max);
    }

    private static void Calculate(ArrayList<Integer> list, ArrayList<Integer> outputs,  int calc, int i) {
        
        if(i == list.size()){
            outputs.add(calc);
        }
        else{
            int pluscalc = calc + list.get(i);
            int multcalc = calc * list.get(i);
            Calculate(list, outputs, pluscalc , i+1);
            Calculate(list, outputs, multcalc, i+1);
        }
    }
}
