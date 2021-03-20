import java.io.*;
import java.util.*;

//dutch national flag problem
public class week4task3Sorting{
  
  
    private static Random rand = new Random();//rand an object of random class
    //so that we can use rand.nextInt(int n);
    //which givesa random number between 0(inclusive) and the number passed in this argument(n), exclusive.
    //rand.nextInt(10) means 0-9
    
    
    private static int[] partition3(int[] a, int l, int r) {
     int x=l;//i=placement index
     int pivot=a[r];
     for(int i=l;i<=r;i++){
       if(a[i]<pivot){//swap i with x
        int temp=a[i];
        a[i]=a[x];
        a[x]=temp;
        x++;
       }
     }
     //all elements less than pivot has been placed to left ^
     int y=r;//y=placement index
     for(int j=r; (j>=l) && (a[j]>=pivot) ;j--){//scanning from right
       if(a[j]>pivot){//swap j with y
        int temp=a[j];
        a[j]=a[y];
        a[y]=temp;
        y--;
       }
    }
     //all elements greater than pivot has been placed to right^     
     //so all elements equal pivot is in middle

     int m1=x;
     int m2=y;
     int [] m={m1,m2};
     return m;
    }
     
//    private static int partition2(int[] a, int l, int r){//owns code
//        int i=l-1;//here r is pivot index
//        int j=l;
//        while(j<r){
//          if(a[j]>a[r]){
//           j++;
//          }
//          else{//swap j with i+1
//           int w=a[j];
//           a[j]=a[i+1];
//           a[i+1]=w;
//           j++;
//           i++;
//          }
//        }
//        //swap a[i+1] and a[r]
//        int s=a[r];
//        a[r]=a[i+1];
//        a[i+1]=s;
//        return i+1;
//    }
        
        
    

    private static void randomizedQuickSort(int[] a, int l, int r) {
        if (l >= r) {
            return;
        }
        int k = rand.nextInt(r - l + 1) + l;//(little complex)pivot index is chosen here
        int t = a[r];//swap with right of array to make it pivot
        a[r] = a[k];
        a[k] = t;
        //use partition3
        int [] m=new int[2];
        m=partition3(a,l,r);
        randomizedQuickSort(a,l,m[0]-1);
        randomizedQuickSort(a,m[1]+1,r);
        
        
//for partition2        
//        int m = partition2(a, l, r);
//        randomizedQuickSort(a, l, m - 1);
//        randomizedQuickSort(a, m + 1, r);
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();//n=array length
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        randomizedQuickSort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
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

