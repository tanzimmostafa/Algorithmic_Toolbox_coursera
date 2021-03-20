import java.util.*;
import java.io.*;

public class Week3task3CarFueling{
    static int computeMinRefills(int dist, int tank, int[] stops){
      //
      int n=stops.length;//n=number of station stops
      int [] x=new int[n+2];//x=new array containing allPositions (tomake things easier)
      x[0]=0;
      x[x.length-1]=dist;
      int count=0;
      for(int i=1;i<=n;i++){
        x[i]=stops[count++];
      }
      ///real thing starts now:
      int nR=0;//nR=NumberOfRefills
      int cR=0;//cR=currentRefill->always points tothe currentStation we are in
      while(cR<=n){
        int lR=cR;//lR=lastRefill
        while(cR<=n && (x[cR+1]-x[lR]<=tank)){//will goto furthest reachableStation
          cR=cR+1;
        }
        if(cR==lR){//means itwas unable to goTo next station
          return -1;
        }
        if(cR<=n){      
         nR=nR+1;
        }
      }
      return nR;    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
        scanner.close();
    }
}
