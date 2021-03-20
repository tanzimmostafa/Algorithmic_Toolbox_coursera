//fibonacci no. again

import java.util.Scanner;
public class week2task5{

  public static long fib(long n,int m){
    int length=(int)(1000000);
    int count=2;
    long [] f=new long[length];
    f[0]=0;
    f[1]=1;
    for(int i=2;i<=length;i++){
       
       f[i]=(f[i-1]+f[i-2])%m;
       
       if(f[i]==0){
        f[i+1]=(f[i]+f[i-1])%m;
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
  
  public static void main(String [] args){
      
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    int m = sc.nextInt();

    System.out.println(fib(n,m));
  }
}