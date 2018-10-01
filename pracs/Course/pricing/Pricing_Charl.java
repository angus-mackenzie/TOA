
import java.util.Scanner;

/**
 *
 * @author Charl Ritter
 */
public class Pricing_Charl {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        long n = keyboard.nextLong();
        
        long min = (long) Math.sqrt(n);
        long max = min*2;
        
        long k = 0;
        if(n<4){
            k = 2;
        }
        else{
            k = FindPrice(n, min, max);
        }
        
        System.out.println("");
        System.out.println(k);
    }

    private static long FindPrice(long n, long min, long max) {
        long k = ((max-min)/2)+min;
        long sum = 0;
        long next = 0;
        long j = 1;
        boolean flag = true;
        
        while (j < k) {
            sum += j*(k/j);
            j++;
            if(sum>n){
                flag = false;
                break;
            }
        }
        
        if(flag == true){
            j=1;
            while (j < k+1) {
                next += j*((k+1)/j);
                j++;
            }
        }    
        
        boolean test1 =next<n;
        boolean test2 =sum<n;
        if(sum<n && next<n){
            k = FindPrice(n, k, max);
        }
        else if(sum>n){
            k = FindPrice(n, min, k);
        }
        
        return k;
    }
}
