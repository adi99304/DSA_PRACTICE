package arrays;
import java.util.*;
public class reversearr {
    public static void main(String[] args) {
        int[] a= {2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int start=0;
        int end= a.length-1;
        int temp=0;
        while(start<end){
            temp= a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(a));
    }
}
