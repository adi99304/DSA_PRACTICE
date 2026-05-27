package patterns;
import java.util.*;
public class starpattern{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        // 1) Normal star pattern
        for(int i =0;i<=a;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
        // 2) INVERTED STAR PATTERN
        for(int i=0;i<=a;i++){
            for(int j =a-1;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}