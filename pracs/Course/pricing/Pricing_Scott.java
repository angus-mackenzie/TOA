import java.util.Scanner;
/**
 * @author Scott Hallauer
 * @version 1/10/2018
 */
public class Pricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long max = Long.parseLong(sc.nextLine());

        System.out.println(search(0,1000000,max));
    }
    public static long cost (int k){
        long total = 0;
        for(int j = 1; j < k;j++){
            total+=j*(k/j);
        }
        return total;
    }
    public static int search(int lo, int hi, long N){
        if(hi<lo){
            return hi;
        }else{
            int mid = ((hi+lo)/2);
            long price = cost(mid);
            if(price == N){
                return mid;
            }else if(price < N){
                return search(mid+1,hi,N);
            }else{
                return search(lo,mid-1,N);
            }
        }
    }
}
