package HW;
import java.util.*;

public class avgmethod{
static int avg(int a , int b, int c){
    return (a+b+c)/3;
}
static boolean evenodd(int num){
        boolean iseven= false;
        if(num%2==0){
            iseven=true;
        }
        return iseven;
}
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
        //   int b = sc.nextInt();
        //   int c = sc.nextInt();
        // int j = avg(a, b, c);
        // System.out.println(j);
        boolean b = evenodd(a);
        System.out.println(b);
    }
}
