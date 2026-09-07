package HW;

public class keyoccurences{
    static void occurences(int key , int[] arr,int i ,int count){
        if(i==arr.length){
            System.out.println(count);
            return;
        }
        if(key== arr[i]){
            System.out.println(i);
            count ++;
        }
        
        occurences(key, arr, i+1, count);
    }
    static void intotstring(int n,String[] words ){
        if(n==0){
            return;
        }
        int a = n%10;
       
        intotstring(n/10, words);
         System.out.println(words[a]);
    }
    static void lengthofstring(String str, int i ){
       try{
        str.charAt(i);   
            lengthofstring(str, i+1);
       }
       catch(StringIndexOutOfBoundsException e){
        System.out.println(i);
        return;
       }
    }
    static int contiguous(String str,int start, int i, int count){
        if(i== str.length()){
            if(start == str.length()){
                return count;
            }
            return contiguous(str, start+1, start+1, count);
        }
        if( str.charAt(start)==str.charAt(i)){
            count++;
        }
       return  contiguous(str, start, i+1, count);
        
    }
static void towerofhanoi(int n ,String source,String helper,String dest){
    if(n==1){
         System.out.println("transfer disk " + n + "FROM " + source+" to " + dest);
        return;
    }
    towerofhanoi(n-1,source,dest,helper);
    System.out.println("transfer disk " + n + "FROM " + source+" to " + dest);
    towerofhanoi(n-1, helper,source ,dest);

}
    public static void main(String[] args) {
        // int[] arr= {3,2,4,5,6,2,7,2,2};
        // occurences(2, arr, 0, 0);
        // String[] words= {
        //     "zero", "one", "two", "three", "four",
        //     "five", "six", "seven", "eight", "nine"
        // };
        // intotstring(194, words);
        // String str=  "abcab";
        // // lengthofstring(str, 0);
        // int  c=contiguous(str,0,0,0);
        // System.out.println(c);
        towerofhanoi(3, "S", "H", "D");
    }
}