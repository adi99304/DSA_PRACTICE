import java.util.*;
public class largestofthree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if (a>b){
            if(a>c){
                System.out.println("largestno." +a);
            }
            else {
                System.out.println("largestno." +c);
            }
        }
        else{
            if(b>c){
                System.out.println("largestno." +b);
            }
            else{
                System.out.println("largestno." + c);
            }
        }
    }
}
