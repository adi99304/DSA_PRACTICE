package functions;
import java.util.*;
public class decimaltobinary {
    public static void main(String[] args) {
        //this approach is not optimized
        // int sum=0;
        // int number =5;
        // int perm=0;
        // for (int i=0;i<8;i++){
            
        //     int value = (int)Math.pow(2,i);
        //     if(value>number){
        //         number=number-perm;
        //         sum=sum+ (int)Math.pow(10,i-1);
        //         i=-1;
        //     }
        //     perm =value;
        // }
        // System.out.println(sum);
        int num=13;
        int i=0;
        int rem=0;
        int sum=0;
        while(num>0){
            rem=num%2;
            sum= (sum*10)+rem;
            num=num/2;
            i++;
        }
        System.out.println(sum);
    }
}
