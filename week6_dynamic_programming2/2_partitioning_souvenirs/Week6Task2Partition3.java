import java.util.*;
import java.io.*;
import java.util.stream.IntStream;
public class Week6Task2Partition3{
    private static int partition3(int[] a) {
        int sum=0;//sumof array items
        for(int i=0;i<a.length;i++){
         sum+=a[i];
        }
        if(sum%3!=0){
         return 0;
        }
        boolean [] used=new boolean[a.length];//whether item has been usedornot
        boolean ans=canPart(0,a,used,3,0,sum/3);//canPartition
        if(ans==true){
         return 1;
        }else{
         return 0;
        }
    }
    //inProgressSum
    private static boolean canPart(int startIndex,int []a,boolean [] used,int k,int inProgSum,int targetSum){
      if(k==1){
       return true;
      }
      if(inProgSum==targetSum){
       return canPart(0,a,used,k-1,0,targetSum);
      }
      for(int i=startIndex;i<a.length;i++){
        if(used[i]==false && inProgSum+a[i]<=targetSum){
          used[i]=true;
          if(canPart(i+1,a,used,k,inProgSum+a[i],targetSum)==true){
            return true;
          }
          used[i]=false;
        }
      }
        return false;       
      }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(partition3(A));
    }
}

