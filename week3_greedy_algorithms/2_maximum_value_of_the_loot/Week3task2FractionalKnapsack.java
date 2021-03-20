import java.util.Scanner;

public class Week3task2FractionalKnapsack{
  
    private static double getOptimalValue(int capacity,int[] values,int[] weights){
        double value = 0;
        for(int x=0;x<values.length;x++){
          
          if(capacity==0){
           return value;
          }
          //to find i with max V/W and Wi>0
          double max=-1.0;
          int i=-1;
          for(int y=0;y<values.length;y++){
            double ratio=(double)values[y]/weights[y];
            if(weights[y]>0 && ratio>max){
              max=ratio;
              i=y;
            }
          }         

          int a=Math.min(weights[i],capacity);//a contains maxmweight oftheitemwecan take
          double r=(double)values[i]/weights[i];
          value=value+(a*r);
          weights[i]=weights[i]-a;
          capacity=capacity-a;
        }  
          return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.printf("%.4f %n",getOptimalValue(capacity, values, weights));
    }
} 
