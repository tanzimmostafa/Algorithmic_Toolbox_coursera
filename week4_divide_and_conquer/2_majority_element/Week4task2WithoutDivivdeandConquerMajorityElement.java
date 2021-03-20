import java.util.*;
import java.io.*;
import java.util.Arrays; 
//works all case
public class Week4task2WithoutDivivdeandConquerMajorityElement{
  
  public static int getMajorityElement(int [] a,int l){
  
    Arrays.sort(a);
      
      int count=1;
     // int maxCount=-1;
      int temp=a[0];
     // int majorElem;
      
      for(int i=1;i<a.length;i++){
        if(temp==a[i]){
         count++;
        }else{
         count=1;
         temp=a[i];
        }
      //  if(count>maxCount){
       //   maxCount=count;
          
          
          if(count>(a.length/2)){
           // majorElem=a[i];
            return 1;
          }
        }
  //}
      return -1;
    }
            
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if ((getMajorityElement(a,a.length)) != -1){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

