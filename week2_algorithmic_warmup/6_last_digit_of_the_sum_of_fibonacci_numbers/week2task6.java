//Last Digit of the Sum of Fibonacci Numbers

import java.util.Scanner;
public class week2task6{

  public static long fiblastdigit(long n){
    int length=(int)(1000000);
    int count=2;
    long [] f=new long[length];
    f[0]=0;
    f[1]=1;
    for(int i=2;i<=length;i++){
       
       f[i]=(f[i-1]+f[i-2])%10;
       
       if(f[i]==0){
        f[i+1]=(f[i]+f[i-1])%10;
        if(f[i+1]==1){
        break;
        }
       }      
       count++;
    }
  //  System.out.println(count);
    long realfib=n%count;
    return f[(int) realfib];
  }
  public static long lastsumfib(long n){
    long ans=(fiblastdigit(n+2)+10-1)%10;//+10 to account for 0
   return ans;
   
  }
  
  
  public static void main(String [] args){
      
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    

    System.out.println(lastsumfib(n));
  }
}