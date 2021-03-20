import java.util.*;
public class Week5Task4LCS2{

    private static int lcs2(int[] a, int[] b){
      int l1=a.length;
      int l2=b.length;
      int [][] dp=new int[l1+1][l2+1];
      
      for(int i=0;i<=l1;i++){
        for(int j=0;j<=l2;j++){
          
          if(i==0 || j==0){
           dp[i][j]=0;
          }
          else if(a[i-1]==b[j-1]){//incase of match
           dp[i][j]=1+dp[i-1][j-1];
          }
          else{
           dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
          }
        }
      }
      return dp[l1][l2];
    }
      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        System.out.println(lcs2(a, b));
    }
}

