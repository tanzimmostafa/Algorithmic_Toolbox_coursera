import java.util.Scanner;
public class week1task2fast{
  //or we can sort in ascending order
  //and then multiply the last 2 values
  //in that case O(nlogn)while now it is O(2n)
  public static long MaxPairwiseProduct(long [] b){
    int maxid1=0;//indexofmax1
    for(int i=1;i<=b.length-1;i++){
  if(b[i]>b[maxid1]){
    maxid1=i;
  }
}
    //swap//value if first maximum sent to end of array
    long temp=b[b.length-1];
    b[b.length-1]=b[maxid1];
    b[maxid1]=temp;
    //
    int maxid2=0;
    for(int i=1;i<=b.length-2;i++){
      if(b[i]>b[maxid2]){
    maxid2=i;
  }
    }
      long ans=b[b.length-1]*b[maxid2];;
      return ans;
    }
        
  
  
  public static void main(String [] args){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();//index in long array also has to be int
   long [] a=new long[n];//a contains the numbers
   for(int i=0;i<n;i++){
     a[i]=sc.nextLong();
   }
   System.out.println(MaxPairwiseProduct(a));
  }
}