package arrays;
import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        int[] s= {2,4,6,8,10,12,14};
        int n = s.length;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int start=0;
        int end= n-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(s[mid]==a){
                System.out.println(mid);
                break;
            }
            else if (a<s[mid]){
                start=0;
                end=mid-1;
            }
            else{
                start=mid+1;
                end= n-1;
            }
        }
    }
}
