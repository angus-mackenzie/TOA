
import java.util.Scanner;

/**
 *
 * @author Charl Ritter
 */
public class Animal_Profit_Charl {
    public static void main(String[] args) {
        Scanner keyboad = new Scanner(System.in);
        double pc = Double.parseDouble(keyboad.next());
        double ps = Double.parseDouble(keyboad.next());
        double pg = Double.parseDouble(keyboad.next());
        double f = keyboad.nextDouble();
        double fc = Double.parseDouble(keyboad.next());
        double fs = Double.parseDouble(keyboad.next());
        double fg = Double.parseDouble(keyboad.next());
        double w = keyboad.nextDouble();
        double wc = Double.parseDouble(keyboad.next());
        double ws = Double.parseDouble(keyboad.next());
        double wg = Double.parseDouble(keyboad.next());
        
        String output = MaxProfit(pc, ps, pg, f, fc, fs, fg, w, wc, ws, wg);
                
        System.out.println("");
        System.out.println(output);
    }

    private static String MaxProfit(double pc, double ps, double pg, double f, double fc, double fs, double fg, double w, double wc, double ws, double wg) {
        double food_cows = f/fc;
        double water_cows = w/wc;
        double cows;
        if(food_cows>=water_cows){
            cows = food_cows;
        }
        else{
            cows = water_cows;
        }
        double food_sheep = f/fs;
        double water_sheep = w/ws;
        double sheep;
        if(food_sheep>=water_sheep){
            sheep = food_sheep;
        }
        else{
            sheep = water_sheep;
        }
        double food_goats = f/fg;
        double water_goats = w/wg;
        double goats;
        if(food_goats>=water_goats){
            goats = food_goats;
        }
        else{
            goats = water_goats;
        }
        
        double max = 0;
        String output = "";
        for (int c = 0; c <= cows; c++) {
            for (int s = 0; s <= sheep; s++) {
                for (int g = 0; g <= goats; g++) {
                    if(((fc*c)+(fs*s)+(fg*g))<=f && ((wc*c)+(ws*s)+(wg*g))<=w){
                        double p = (pc*c)+(ps*s)+(pg*g);
                        if(p>max){
                            max = p;
                            output = c+" "+s+" "+g;
                        }
                    }
                }
            }
        }
        
        return output;
    }
}
