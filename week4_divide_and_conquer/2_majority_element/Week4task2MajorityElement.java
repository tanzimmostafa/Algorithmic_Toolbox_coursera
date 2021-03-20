import java.util.*;
import java.io.*;
//all cases right
public class Week4task2MajorityElement{
    private static int getMajorityElement(int[] a, int left, int right) {
        if (left == right) {
            return a[left];
        }
        int mid=(left+right)/2;
        int leftElem=getMajorityElement(a,left,mid);//gives majorelement of this subarray
        int rightElem= getMajorityElement(a,mid+1,right); 
     //   if(leftElem==rightElem){
     //    return leftElem;
     //   }
        int leftCount=frequency(a,leftElem,left,right);
        int rightCount=frequency(a,rightElem,left,right);
       
        int arraylength=(right-left)+1;//length for that specificarray
        if(leftCount>=((arraylength/2)+1)){          
         return leftElem;
        }
        else if(rightCount>=((arraylength/2)+1)){        
          return rightElem;
        }
        else{
         return -1;
        }
    }
    //function to find frequency of given number in array
    static int frequency(int [] a,int num,int left,int right){
      int count=0;
      for(int i=left;i<=right;i++){
        if(a[i]==num){
      count++;
      }
      }      
        return count;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (getMajorityElement(a, 0, a.length-1) != -1) {
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

