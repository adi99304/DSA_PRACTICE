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
            
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            for(int k =1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int y=1; y<=i;y++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =n ;i>=1;i--){
            for(int j =i;j>=1;j--){
                System.out.print("*");

            }
            
            for(int j =1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int h =i;h>=1;h--){
                System.out.print("*");
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
    static void rhombus(int n ){
        for(int i =1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k =1;k<=n;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void hollowrhombus(int n){

        for(int i =1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            // int b=1;
            for(int k =1;k<=n;k++){

                if(i==1 || i==n || k==1||k==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            
            }
            System.out.println();
            
        }
    }
    static void diamond(int n ){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k =1 ;k<= 2*(i-1)+1;k++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i =n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k =1 ;k<= 2*(i-1)+1;k++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b= sc.nextInt();
        // star(a);
        // number(a);
        // floydtri(a);
        // zeroone(a);
        // butterfly(a);
        // rhombus(a);
        // hollowrhombus(a);
        diamond(a);
    }
}
