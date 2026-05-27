package HW;
import java.util.*;

public class ifelse {
public static void main(String[] args) {
    // 1) positive negative number
    Scanner sc = new Scanner(System.in);
    int b= sc.nextInt();
    if(b>0){
        System.out.println("Positive");
    }
    else{
        System.out.println("negative");
    }
    // 2) temperature code
    double temp= 103.5;
    if (temp>100){
        System.out.println("high temperature" );
    }
    else{
        System.out.println("not sick");
    }
    // 3) Leap year
    // Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a%4==0){
        if(a%100==0){
            if (a%400==0){
                System.out.println("leap year");
            }
            else{
                System.out.println("not leap year");
            }
        }
        else{
            System.out.println("leap year");
        }
    }
    else{
        System.out.println("not leap year");
    }
}    

}
