package functions;
import java.util.*;
public class factorialfunc {
    static int fact(int a,int f){
        if(f==a){
            return a;
        }
        
        
        return fact(a, f+1)*f;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    int f =1;
    int s= fact(a,f);
    
    int g= fact(b,f);
    int k= a-b;
    int n= fact(k,f);
    int o=(s)/g*n;
    System.out.println(o);
    
}    
}
