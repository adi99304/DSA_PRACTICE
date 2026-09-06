package recursion;
public class sorted{
    static boolean is_sorted(int[]arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        
return is_sorted(arr, i+1);

    }
    static int firstoccurence(int[] arr,int key,int i ){
        
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length){
            return -1;
        }
        return firstoccurence(arr, key, i+1);
    }
    static int  lastoccurence(int[] arr, int key, int i ){
        if(i== arr.length){
            return -1;
        }
        int isFound= lastoccurence(arr, key, i+1);
        if(isFound == -1 && arr[i]== key){
            return i;
        }
        return isFound;
    }
    static int  pow(int x , int n){
        if(n==1){
            return x;
        }
        return x * pow(x,n-1);
    }
    static int optimizedpower(int x , int n){
        if(n==1){
            return x;
        }
        int half=optimizedpower(x, n/2);
        if(n%2==0){
            return half * half;
        }
        else{
            return half * half *x ;
        }
    }
    public static void main(String[] args) {
        // int[] arr= {1,2,1,3,1};
        // boolean a=is_sorted(arr, 0);
        // System.out.println(a);
        // int k =lastoccurence(arr, 5, 0);
        // System.out.println(k);
        // int a = pow(2,16);
        // System.out.println(a);
        System.out.println(optimizedpower(2, 3));
    }
}