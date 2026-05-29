package functions;
import java.util.*;
public class Binarytodecimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = Integer.toString(n).length();
        int dec=0;
        for(int i =0;i<k;i++){
            int ld= n%10;
            n = n/10;
            dec= dec+(int)Math.pow(2,i)*ld;
        }
        System.out.println(dec);
    }
}