
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Charl Ritter
 */
public class Product_Charl {
    public static void main(String[] args) {
        ArrayList<Double> sequence = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        String[] parts = input.split(" ");
        for(String part:parts){
            sequence.add(Double.parseDouble(part));
        }
    
        int output = FindSubsequence(sequence);
        
        System.out.println("");
        System.out.println(output);
    }        

    private static int FindSubsequence(ArrayList<Double> sequence) {
        double highest_product = 1;
        ArrayList<Double> subsequence = new ArrayList<>();
        ArrayList<Double> longest = new ArrayList<>();
        boolean flag = true;
        
        for(Double number:sequence){
            if(number*highest_product > highest_product){
                if(flag == true){
                    flag = false;
                    subsequence.clear();
                }
                highest_product *= number;
                subsequence.add(number);
            }
            else{
                if(subsequence.size() > longest.size()){
                    longest.clear();
                    longest.addAll(subsequence);
                }
                highest_product = 1;
                flag = true;
            }
        }
        
        return longest.size();
    }
}
