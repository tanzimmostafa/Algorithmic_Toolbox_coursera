import java.util.Scanner;

public class Changeweek3task1{
    private static int getChange(int m){
      int count=0;
      for(;;){
        m=m-10;
        count++;
        if(m<0){
         m=m+10;
         count--;
         break;
        }
      }
         for(;;){
        m=m-5;
        count++;
        if(m<0){
         m=m+5;
         count--;
         break;
        }
      }
       for(;;){
        m=m-5;
        count++;
        if(m<0){
         m=m+5;
         count--;
         break;
        }
      }
     for(;;){
        m=m-1;
        count++;
        if(m<0){
         m=m+1;
         count--;
         break;
        }
      }
         
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(getChange(m));

    }
}

