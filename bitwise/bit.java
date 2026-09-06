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
    static int clearith(int n ,int i ){
        int bitmask=1<<i;
        return n^bitmask;
    }
    static int updateithbit(int n , int i,int newbit){
        if(newbit==0){
            return clearith(n, i);
        }
        else{
            return setith(n, i);
        }
        
    }
    static int clearbits(int n , int i){
        int bitmask=-1<<i;
        return n& bitmask;
    }
    static int clearibits(int n,int i,int j){
        int  a=((~0)<<(j+1));
        int b =1<<i-1;
        int c = a|b;
        return n &c;


    }
    static int fastexp(int n, int a){
         int prod=1;
        while(a>0){
            int r=a%2;
           
            if(r==1){
                prod=prod*n;
            }
            n=n*n;
            a=a>>1;
        }
        return prod;

    }
    // static voif 
    public static void main(String[] args) {
        // oddoreven(9);
        // System.out.println(1<<2 );
        // getith(5, 2);
        // int a= setith(5, 1);
        // int a = clearibits(10, 2,4);
        int a =fastexp(5, 3);
        System.out.println(a);
    }
}
