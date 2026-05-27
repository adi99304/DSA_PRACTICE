package functions;
import java.util.*;

public class swapping {
    static void swap(int num1, int num2){
        int temp = num1;
        num1= num2;
        num2= temp;
        System.out.println("a =" + num1);
        System.out.println("b =" + num2);
    }
    static int multiply(int a , int b){
        int product= a*b;
        return product;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a ");
       int a= sc.nextInt();
       System.out.print("Enter b ");
       int b = sc.nextInt();
        // swap(a,b);
        int s =multiply(a, b);
        System.out.println(s);
        s =multiply(2, 3);
        System.out.println(s);
    }
}
