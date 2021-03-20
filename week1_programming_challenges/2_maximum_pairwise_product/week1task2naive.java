import java.util.Scanner;
public class week1task2naive{
  //time:O(n^2)-so not fast
  public static int MaxPairwiseProduct(int [] b){
    int product=0;
    for(int i=0;i<b.length;i++){
      for(int j=i+1;j<b.length;j++){
        product=Math.max(product,b[i]*b[j]);
      }
    }
    return product;
  }
        
  
  
  public static void main(String [] args){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int [] a=new int[n];//a contains the numbers
   for(int i=0;i<n;i++){
     a[i]=sc.nextInt();
   }
   System.out.println(MaxPairwiseProduct(a));
  }
}