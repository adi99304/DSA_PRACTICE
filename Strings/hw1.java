package Strings;
import java.util.*;
import java.util.Arrays;
public class hw1{
    static void lowercase(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>'a' && str.charAt(i)<'z'){
                count++;
            }
        }
        System.out.println(count);
    }
    static void hashing(String str1,String str2){
        char[] arr1= str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("these are the anagrams");
        }
        else{
            System.out.println("not anagrams");
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s1 = sc.nextLine();
       String s2 = sc .nextLine();
    //    lowercase(s);
        hashing(s1, s2);
    }
}