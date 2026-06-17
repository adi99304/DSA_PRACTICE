package arrays;
import java.util.Arrays;
import java.util.Collections;

public class sorting {
    static int[] bubble(int[] arr){
        int n = arr.length;
        for(int j=0;j<arr.length;j++){
            for(int i =0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=0;
                temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
        }


        }
        
        return arr;
    }
    static int[] selection(int[] arr){
        
        for(int i =0;i<arr.length;i++){
            int min= Integer.MAX_VALUE;
            int c=0;
            for(int j=i;j<arr.length;j++){                
                if(arr[j]<min){
                    min=arr[j];
                    c=j;
                }
            }
            int temp=0;
            temp=arr[i];
            arr[i]=min;
            arr[c]=temp;
        }
        return arr;
    }
    static int[] insertion(int[] arr){
        for(int i =1;i<arr.length;i++){
            int curr=arr[i];
            int prev= i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        return arr;
    }
    static int[] counting(int[] arr){
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest= Math.max(largest,arr[i]);
        }
        int[] count = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
            }
            int j =0;
        for(int i =0;i<count.length;i++){
            
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
                
            }
        }
           return arr;
        }
        
    
    public static void main(String[] args) {
        int[] r= {1,4,1,3,2,4,3,7};
        // int[] s=bubble(r);
        // for(int i =0;i<s.length;i++){
        //     System.out.print(" "+s[i]);
        // }
        // Arrays.sort(r,Collections.reverseOrder());
        int[] k = counting(r);
        for(int i =0;i<k.length;i++){
            System.out.print(" "+k[i]);
        }
    }
}
