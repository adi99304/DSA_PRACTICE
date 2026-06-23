package bitwise;

public class bit {
    static void oddoreven(int n){
        int bitmask=1;
        if((n & bitmask) ==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    static void getith(int n , int i ){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            
            System.out.println(0);
        }
        else{
            System.out.println(n & bitmask);
            System.out.println(1);
        }
    }
    static int setith(int n ,int i){
        int bitmask=1<<i;
        return n| bitmask;
        
    }
    // static voif 
    public static void main(String[] args) {
        // oddoreven(9);
        // System.out.println(1<<2 );
        getith(5, 2);
        int a= setith(5, 1);
        System.out.println(a);
    }
}
