import java.util.*;

public class Week3Task7LargestNumber{
    private static String largestNumber(int[] a){
      //inputting array a's contents in an array list
      //to make it easier to remove from arraylist
      //arraylist is a dynamic array
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
         al.add(a[i]);
        }
        ///
        String result = "";
        while(al.isEmpty()==false){
          int maxDigit=-1999;
          int index=-1;
          for(int i=0;i<al.size();i++){
            if(realMax(al.get(i),maxDigit)==true){//if(digit>=maxdigit)
           maxDigit=al.get(i);
           index=i;
          }
          }
          result=result+maxDigit;
          al.remove(index);           
          }
        
          return result;
    }
    public static boolean realMax(int a,int b){
     String x=Integer.toString(a);//to turn into string
     String y=Integer.toString(b);
     
     String xy=x+y;
     String yx=y+x;
     
     if(xy.compareTo(yx)>=0){
       return true;
     }else{
      return false;
     }
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(largestNumber(a));
    }
}

