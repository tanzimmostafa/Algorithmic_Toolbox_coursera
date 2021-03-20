 import java.util.Scanner;
public class week2task6naive{

  public static long sumfib(int n){
    long [] sumf=new long[n+2];
    sumf[0]=0;
    sumf[1]=1;
    for(int i=2;i<=n;i++){
     sumf[i]=((sumf[i-1]+sumf[i-2])+1)%10;
    }
    return sumf[n];
  }
  
  public static void main(String [] args){
      
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(sumfib(n));
  }
}