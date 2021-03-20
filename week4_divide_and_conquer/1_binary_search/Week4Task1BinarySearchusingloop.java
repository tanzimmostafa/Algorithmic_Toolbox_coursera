import java.io.*;
import java.util.*;

public class Week4Task1BinarySearchusingloop{

    static int binarySearch(int[] a, int x){
      int low=0;
      int high=a.length-1;
      while(low<=high){
       int mid=(low+high)/2;
       if(a[mid]==x){
       return mid;
       }
       else if(a[mid]>x){
        high=mid-1;
       }
       else{
        low=mid+1;
       }
      }
       return -1;
      
      }
         
    
    
    static int bS(int [] a,int low,int high,int x){
      if(low>high){//base case
       return -1;
      }
      int mid=(low+high)/2;//mid is the mid index
      if(a[mid]==x){
       return mid;
      }
      else if(a[mid]>x){
       return bS(a,low,mid-1,x);
      }
      else{
       return bS(a,mid+1,high,x);
      }
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
          b[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            //replace with the call to binarySearch when implemented
            System.out.print(binarySearch(a, b[i]) + " ");
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
