import java.util.*;
public class breakcontinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{
            int a= sc.nextInt();
            if(a%10==0){
                System.out.println("Multiple of 10");
                continue;
            }

        } while(true);
    }
}
