package HW;
import java.util.*;
public class palindrome {
    static boolean pal(int a, int sum, int ld,int j){
        boolean ispal= false;
        while (a>0) {
            ld=a%10;
            sum= sum*10+ ld;
            a=a/10;
        }
        if(sum==j){
            ispal=true;
        }
        return ispal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ld=0;
        int sum=0;
        int j=a;
        boolean k = pal(a, sum, ld, j);
        System.out.println(k);
        
    }
}
