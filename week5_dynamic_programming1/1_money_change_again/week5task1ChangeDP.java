import java.util.Scanner;

public class week5task1ChangeDP{
    private static int getChange(int m){
       int [] coins={1,3,4};
       int [] MinNumCoins=new int[m+1];    
       MinNumCoins[0]=0;
        
        for(int i=1;i<=m;i++){//i =money
          MinNumCoins[i]=Integer.MAX_VALUE;//inf
          for(int j=0;j<coins.length;j++){//j=coin denomination
            if(i>=coins[j]){
              int NumCoins=MinNumCoins[i-coins[j]]+1;
              if(NumCoins<MinNumCoins[i]){
                MinNumCoins[i]=NumCoins;
              }
            }
          }
        }
        return MinNumCoins[m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

