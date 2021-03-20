//fibonacci no. again

import java.util.Scanner;
public class week2task5{

  public static long fib(long n,int m){
    long newcurrent=-1;;
    long [] f=new long[2^31-1];
    f[0]=0;
    long previous=0;
    f[1]=1;
    long current=1;
    for(int i=2;i<=n;i++){
       //f[i]=(f[i-1]+f[i-2])%m;
        newcurrent=(current+previous)%m;
        previous=current;
        current=newcurrent;
        
     
    }
    return newcurrent;
  }
  
  public static void main(String [] args){
      
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    int m = sc.nextInt();

    System.out.println(fib(n,m));
  }
}