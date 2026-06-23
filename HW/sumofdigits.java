package HW;
import java.util.*;
public class sumofdigits {
    static int sum(int j ){
        int sum =0;
        int ld=0;
        while(j>0){
            ld=j%10;
            sum= sum+ld;
            j=j/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int h= sum(a);
        System.out.println(h);
    }
}
