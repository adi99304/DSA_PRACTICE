package HW;
import java.util.*;
public class sumevenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a= sc.nextInt();
        
        int sume=0;
        int sumo=0;
        int choice= 1;
        while(choice==1){
            int n=sc.nextInt();
            if(n%2==0){
                sume=sume+n;
            }
            else{
                sumo=sumo+n;
            }
            n++;
        choice= sc.nextInt();
        }
        System.out.println(sume);
        System.out.println(sumo);
    }
}
