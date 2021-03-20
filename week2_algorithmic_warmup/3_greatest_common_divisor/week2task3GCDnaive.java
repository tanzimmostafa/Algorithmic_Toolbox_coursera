import java.util.*;

public class week2task3GCDnaive{
  private static int gcd_naive(int a, int b) {
   int best=0;
   for(int d=1;d<=a && d<=b;d++){
     if(a%d==0 && b%d==0){
       best=d;
     }
   }
    return best;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd_naive(a, b));
  }
}
