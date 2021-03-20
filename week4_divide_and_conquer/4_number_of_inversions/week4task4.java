//not merge modified
//O(n^2)
//works but time complexity learger than if merge used which gives nlogn
import java.util.Scanner;
class week4task4{ 
  
    static int getNumberOfInversions(int [] arr,int n){ 
        int inv_count = 0; 
        for (int i = 0; i < n - 1; i++) {
          for (int j = i + 1; j < n; j++){ 
            if (arr[i] > arr[j]){
                    inv_count++; 
            }
          }
        } 
        return inv_count; 
    } 
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        System.out.println(getNumberOfInversions(a,a.length));
    }
}