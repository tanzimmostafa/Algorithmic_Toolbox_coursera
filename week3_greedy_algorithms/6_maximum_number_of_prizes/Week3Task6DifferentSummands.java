import java.util.*;

public class Week3Task6DifferentSummands{
    private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();
        int num=n;
        for(int l=1;;l++){//add 1+2+..
          
          if(num>=l+(l+1)){//requirement for taking l
            summands.add(l);
            num=num-l;
          }        
          else{//else add the whole remaining no.
            summands.add(num);
            break;
          }
        }
         
        return summands;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer a : summands) {
            System.out.print(a + " ");
        }
    }
}

