package recursion;

public class ntoone {
    static void func(int n){
        
       if(n==1){
        System.out.println(1);
        return;
       }
    //    System.out.println(n);
       func(n-1);
       System.out.println(n);
    }
    static void incorder(int n , int a){
        
        if(n==1){
            System.out.println(a);
            return ;
        }
    System.out.println(a);
    a++;
    incorder(n-1,a);
    }
    static  int factorial(int n){
        if(n==1){
            return 1;
        }
        return n *factorial(n-1);
    }
    static int  sum(int n){
        if(n==1){
            return 1;
        }
        int a = n+sum(n-1);
        return a;
    }
    static int fibonacci(int n ){
        if(n==0){
        return 0;
        }
        if(n==1){
            return 1;
        }
        int fib=fibonacci(n-2)+fibonacci(n-1);
        
        return fib;
    }
    public static void main(String[] args) {
        int a=1;
        int n =10;
        // func(n);
        // incorder(n,a);
        // int fact=factorial(10);
        // System.out.println(fact);
        // int sum= sum(3);
        // System.out.println(sum);
        int f=fibonacci(25);
        System.out.println(f);
    }
}
