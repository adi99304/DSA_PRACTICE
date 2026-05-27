package functions;
import java.util.*;
public class functions {
    static int  car(int num1,int num2){
       int sum= num1+num2;
     return sum;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a =sc.nextInt();
       int b =sc.nextInt(); 
       int g =car(a,b);
        System.out.println(g);
    }
}
