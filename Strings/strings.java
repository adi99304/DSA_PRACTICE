package Strings;
import java.util.*;
public class strings {
    static void printletters(String str ){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    static boolean palindrome(String str){
        int i =0;
        int j  = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("not palindrome");
                return false;
                
            }
            i++;
            j--;
        }
        System.out.println("String is a palindrome");
        return true;
        
    }
    public static void main(String[] args) {
        // char[] arr={'a','b'};
        // String a= "Helllo wordl";
        // System.out.println(a);
        Scanner sc = new Scanner(System.in);
        String n= sc.nextLine();
        // System.out.println(n);
        // System.out.println(n.length());
        // System.out.println(n.charAt(2));
        // printletters(n);
        palindrome(n);
    }
}
