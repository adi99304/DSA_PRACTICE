
import java.util.*;

public class trapingwater {
        static  int  trap(int[] arr){
            // int max=Integer.MIN_VALUE;
            int n= arr.length;
            int[] leftmax = new int[arr.length];
            int[] rightmax= new int[arr.length];
            leftmax[0]=arr[0];
            rightmax[n-1]=arr[n-1];
            int lm=0;
            int rm=0;
            for(int i=1;i<arr.length;i++){
                lm=Math.max(arr[i],leftmax[i-1]);
                leftmax[i]=lm;
                rm=Math.max(arr[n-i-1],rightmax[n-i]);
                rightmax[n-i-1]=rm;
            }
            int sub=0;int sum=0;
            for(int i =0;i<arr.length;i++){
                int k=Math.min(leftmax[i],rightmax[i]);
                sub= k-arr[i];
                sum=sum+sub;
            }
            return sum;
        }
    public static void main(String[] args) {
        int[] s= {4,2,0,6,3,2,5};
        int n=trap(s);
        System.out.println(n);

    }
} 
