package patterns;
import java.util.*;

public class allpattern {
    static void star(int  n){
        for(int i =0;i<n;i++){
            for(int j =n ;j>i;j--){
                System.out.print(" ");

            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    static void number(int n ){
        for(int i=1;i<=n;i++){
            int k =1;
            for(int j =n;j>=i;j-- ){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }

    }
    static void floydtri(int n ){
        
        int k =1;
        for(int i=1;i<=n;i++ ){
            
            for(int j =1;j<=i;j++){
                System.out.print(k +" ");
                k++;
            }
            System.out.println();
        }
    }
    static void butterfly(int n ){
        for(int i=1;i<=n;i++){
            if(i<=n/2){
                for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            for(int k =i+1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int y= n-i+1; y<=n;y++){
                System.out.print("*");
            }
            }
            else{
                for(int s =i;s>=1;s--){
                    System.out.print("*");
                }
            //     for(int l=i-1;i<)
            // }
        }
            System.out.println();
        }
    }
    static void zeroone(int n){
            int k =1;
        for(int i=1;i<=n;i++ ){
            
            for(int j =1;j<=i;j++){
                System.out.print(k);
                if(k==0){
                    k=1;
                }
                else{
                    k=0;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // star(a);
        // number(a);
        // floydtri(a);
        // zeroone(a);
        butterfly(a);
    }
}
