import java.util.*;
class Week5task3EditDistance{
  
  public static int min(int x,int y,int z){
    if(x<=y && x<=z){
     return x;
    }
    else if(y<=x && y<=z){
     return y;
    }
    else{
     return z;
    }  
  }

  public static int EditDistance(String s, String t){
    int l1=s.length();
    int l2=t.length();
    int [][] dp=new int[l1+1][l2+1];
    
    for(int i=0;i<=l1;i++){
      for(int j=0;j<=l2;j++){
        
        if(i==0){
         dp[i][j]=j;
        }
        else if(j==0){
         dp[i][j]=i;
        }
        else if(s.charAt(i-1)==t.charAt(j-1)){
         dp[i][j]=dp[i-1][j-1];
        }
        else{//dp[i][j-1]=insert,dp[i-1][j]=delete,dp[i-1][j-1])=replace
         dp[i][j]=1+(min(dp[i][j-1],dp[i-1][j],dp[i-1][j-1]));
        }
      }
    }
      return dp[l1][l2];
    }                                  

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();

    System.out.println(EditDistance(s, t));
  }

}
