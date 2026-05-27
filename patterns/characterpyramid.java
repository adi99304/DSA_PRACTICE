package patterns;
import java.util.*;
public class characterpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        char ch= 'A';
        for(int i=0; i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
