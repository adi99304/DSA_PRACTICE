package recursion;

public class friends {
    static int fri(int n ){
        if(n==1 || n==2){
            return n ;
        }
        int total_ways= fri(n-1) +(n-1) * fri(n-2);
        return total_ways;
    }
    static void binarystr(int n ,StringBuilder str,int lastplace){
        if(n==0 ){
           System.out.println(str);
           return;
        }
        binarystr(n-1, str.append("0"),0);
         str.deleteCharAt(str.length() - 1);
        if(lastplace==0){
            binarystr(n-1, str.append(1), 1);
             str.deleteCharAt(str.length() - 1);
        }
    }
    public static void main(String[] args) {
        // int a= fri(3);
        // System.out.println(a);
         binarystr(3, new StringBuilder(""),0);
        
    }
}
