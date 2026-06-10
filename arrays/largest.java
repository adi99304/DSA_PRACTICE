package arrays;
import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] d= {1,2,9,4,5};
        int largest= Integer.MIN_VALUE;
        for(int i =0;i<5;i++){
            if(largest<d[i]){
                largest=d[i];
            }
        System.out.println(largest);
    }
}
}