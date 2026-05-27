package HW;
import java.util.*;
public class factorial{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int  a= sc.nextInt();
        int i=2;
        int fact=1;
        while(i<=a){
            fact= fact*i;
            i++;
        }
        System.out.println(fact);
    }
}