import java.math.BigInteger;
import java.util.Scanner;
public class fibonacci{
    public static long fiboOne(long n){
        if (n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fiboOne(n-1)+fiboOne(n-2);
    }
    public static BigInteger fiboTwo(int n){
        if(n==0){
            return new BigInteger("0");
        }
        if(n==1){
            return new BigInteger("1");
        }
        BigInteger[] table = new BigInteger[3];
        table[0] = new BigInteger("0");
        table[1] = new BigInteger("1");
        for(int i = 2; i < n; i++){
            table[2] = table[1].add(table[0]);
            table[0] = table[1];
            table[1] = table[2];
        }
        return table[2];
    }
    public static BigInteger fiboThree(int n){
        BigInteger[] values = new BigInteger[n+1];
        values[0] = new BigInteger("0");
        values[1] = new BigInteger("1");
        values[2] = new BigInteger("1");
        for(int i = 3;i<n+1;i++){
            values[i] = values[i-1].add(values[i-2]);
        }
        return values[n];
    }
    public static long runTest(int numTests, int test, int until){
        long totalDuration = 0;
        for(int i = 0; i< numTests;i++){
            if(test==1){
                long startTime = System.nanoTime();
                long val = fiboOne(until);
                System.out.println(val);
                long endTime = System.nanoTime();
                totalDuration += endTime-startTime;
            }else if (test==2){
                long startTime = System.nanoTime();
                System.out.println(fiboTwo(until));
                long endTime = System.nanoTime();
                totalDuration += endTime-startTime;
            }else{
                long startTime = System.nanoTime();
                System.out.println(fiboThree(until));
                long endTime = System.nanoTime();
                totalDuration += endTime-startTime;
            }
        }

        return totalDuration/numTests;
    }
    public static void main(String[] args){
        System.out.println(runTest(1,2,100));
    }
}