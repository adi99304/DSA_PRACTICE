package functions;

import java.util.Scanner;

public class overloading{
    // static void sum(int a , int b){
    //     System.out.println("got integer parameters"+(a+b));
    // }
    // static void sum(float a , float b){
    //     System.out.println("got float parameters"+(a+b));
    // }
    static boolean isPrime(int n ){
        if(n<=1){
            return true;
        }
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // float a = 3;
        // float b =2;
        // sum(a, b);
        boolean g =isPrime(a);
        System.out.println(g);
        
    }
}