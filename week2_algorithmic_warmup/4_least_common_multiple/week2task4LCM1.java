import java.util.*;

public class week2task4LCM1{

  private static long lcm_naive(int a, int b) {
    if(b>a){
    for(long i=a;i<=(long) a*b;i+=a){
      if(i%a==0 && i%b==0){
        return i;
      }
    }
    }else{//a>b
    for(long i=b;i<=(long) a*b;i+=b){
      if(i%a==0 && i%b==0){
        return i;
      }
    }
    
    }
    return (long) a*b;
  }


  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}
