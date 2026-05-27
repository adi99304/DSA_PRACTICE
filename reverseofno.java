import java.util.*;
public class reverseofno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int length= Integer.toString(a).length();
        int k= length;
        int n=0;
        int sum=0;
        for (int i =0;i<=k;i++){
            n=a%10;
            sum=sum+n*((int )Math.pow(10,length-1));
            length--;
            a=a/10;
            

        }
        System.out.println(sum);
    }
}
