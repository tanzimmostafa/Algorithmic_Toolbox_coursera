import java.util.*;

public class Week5Task2PrimitiveCalculator{
  
    public static List<Integer> optimal_sequence(int n){
        List<Integer> sequence = new ArrayList<Integer>();        
        if(n==1){
          sequence.add(1);
          return sequence;
        }
        else{
         int [] result=minop(n);//minop=minoperations array
         return minlist(result,n);
        }
    }
    
    public static List<Integer> minlist(int [] a,int n){
    List<Integer> sequence = new ArrayList<Integer>();
      while(n>=1){
        sequence.add(n);
        if(n%2!=0 && n%3!=0){
         n=n-1;
        }
        else if(n%2==0 && n%3==0){
         int temp=Math.min(Math.min(a[n/2],a[n/3]),a[n-1]);
         if(temp==a[n/3]){
          n=n/3;
         }
         else if(temp==a[n/2]){
          n=n/2;
         }
         else{
          n=n-1;
         }
        }
        else if(n%2==0 && n%3!=0){
         int temp=Math.min(a[n/2],a[n-1]);
         if(temp==a[n/2]){
          n=n/2;
         }
         else{
          n=n-1;
         }
        }
        else if(n%3==0 && n%2!=0){
         int temp=Math.min(a[n/3],a[n-1]);
         if(temp==a[n/3]){
          n=n/3;
         }
         else{
          n=n-1;
         }
        }
        
      }
      if(n==0){//successfully made n=1 from n=n
       Collections.reverse(sequence);
       return sequence;
      } 
       return sequence;//dummy return         
    }
    
    
    public static int[] minop(int n){
           
     int [] result=new int[n+1];
     result[1]=0;
 
     for(int i=2;i<=n;i++){
      
     int min1=result[i-1];
     int min2=Integer.MAX_VALUE;
     int min3=Integer.MAX_VALUE;  
     
     if(i%2==0){
      min2=result[i/2];
     }
     if(i%3==0){
      min3=result[i/3];
     }
     result[i]=1+Math.min(Math.min(min1,min2),min3);
    }
     return result;
    }
    
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = optimal_sequence(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
    }
}

