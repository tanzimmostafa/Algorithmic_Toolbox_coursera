import java.util.Scanner;
public class Week2task3{
  public static int EuclidGCD(int a,int b){
    if(b==0){
     return a;
    }
    else{
      int temp=a%b;
      return EuclidGCD(b,temp);
    }
  }
  
  
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(EuclidGCD(a,b));
  }
}