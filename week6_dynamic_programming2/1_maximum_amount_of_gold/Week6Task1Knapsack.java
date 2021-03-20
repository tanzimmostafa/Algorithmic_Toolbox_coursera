import java.util.*;

public class Week6Task1Knapsack{
   static int [][] dp;
   public static int optimalWeight(int W, int[] w){
      dp=new int[w.length][W+1];
      for(int i=0;i<w.length;i++){//first setting entire array to -1
        for(int j=0;j<W+1;j++){
          dp[i][j]=-1;
        }
      }
      return optimalWeight2(0,W, w);
    }
    static int optimalWeight2(int index, int W, int[] w){     
      int ret1=0;
      int ret2=0;
      if(index>=w.length){
       return 0;
      }
      if(dp[index][W]!=-1){
       return dp[index][W];
      }
      if(w[index]<=W){//either we take it 
       ret1=optimalWeight2(index+1,W-w[index],w)+w[index];
      }
      ret2=optimalWeight2(index+1,W,w);//or we dont
      dp[index][W]=Math.max(ret1,ret2);
      return dp[index][W];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight(W, w));
    }
}

