package arrays;
import java.util.*;
public class allarray{
    static void printpairs(int[] arr){
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+" ," + arr[j]+")");
            }
            System.out.println();
        }
    }
    static  void maxsubarray(int[] arr){
        int n= arr.length;
        int ts=0;
        int max=Integer.MIN_VALUE;
    
        int startindex=0;
        int endindex=0;
        int[] prefix= new int[5];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i =0;i<n;i++){
            
            for(int j =i;j<n;j++){
                int sum=0;
                
            //    for(int k=i;k<=j;k++){
            //     System.out.print(arr[k]+" ,");
            //     sum=sum+arr[k];
                
            //    } 
            sum=i==0? prefix[j]:prefix[j]-prefix[i-1];   
               if(max<sum){
                max=sum;
                startindex=i;
                endindex=j;
               }
               ts++;
               System.out.println();
            }  
            
             }
            //  System.out.println("total subarray"+ts);
             System.out.println("Max sub array value"+max);
            System.out.println("subarray with max sum");
             for(int i =startindex;i<=endindex;i++){
                System.out.print(arr[i] +",");
             }
    }
    static void kadanes(int[] arr){
        int n =arr.length;
        int currsum=0;
        int max =Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            currsum=currsum+arr[i];
            if(currsum<0){
                currsum=0;
            }
            max=Math.max(currsum,max);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
     int[] arr= {-2,3,4,-5,6};
    //  printpairs(arr)   ;
        // maxsubarray(arr);
        kadanes(arr);
}
}