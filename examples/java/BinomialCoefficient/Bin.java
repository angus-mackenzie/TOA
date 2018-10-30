public class Bin{
    static int binomialCoeff(int n, int k){
        if(k == 0 || k == n){
            return 1;
        }
        return binomialCoeff(n-1,k-1) + binomialCoeff(n-1,k);
    }
    
    static int binomialCoeffDP(int n, int k){
        int[][] values = new int[n+1][k+1];
        for(int i = 0; i<n+1; i++){
            for(int j = 0; j<=Math.min(i,k);j++){
                if(j==0 || j== i){
                    values[i][j] = 1;
                }else{
                    values[i][j] = values[i-1][j-1] + values[i-1][j];
                }
            }
        }
        return values[n][k];
    }
    public static void main(String[] args){

        long startTime = System.nanoTime();
        int val = binomialCoeff(10000, 2);
        long endTime = System.nanoTime();
        System.out.println("DC "+val+ " in "+(endTime-startTime)+" nano seconds");

        startTime = System.nanoTime();
        val = binomialCoeffDP(10000, 2);
        endTime = System.nanoTime();
        System.out.println("DP "+val+ " in "+(endTime-startTime)+" nano seconds");
    }
}
