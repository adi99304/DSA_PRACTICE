import java.util.*;
public class buysellstock {
    static int buysell(int[] arr){
        int n = arr.length;
        int profit=0;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
                profit=arr[j]-arr[i];
                max=Math.max(profit,max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] s ={7,1,5,3,6,4};
        int h =buysell(s);
        System.out.println(h);
    }
}
