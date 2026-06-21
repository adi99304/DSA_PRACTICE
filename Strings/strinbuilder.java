import java.util.*;
public class strinbuilder {
    static StringBuilder touppercase(String str){
        StringBuilder s= new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        s.append(ch);
        for(int i =1;i<str.length();i++){
            if(str.charAt(i)== ' '){
                s.append(str.charAt(i));
                s.append(Character.toUpperCase(str.charAt(i+1)));
                i+=1;
                
            }
            else{s.append(str.charAt(i));}
        }
        return s;
    }
    static String compression(String str){
        int n = str.length();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<n;i++){
            int count=1;
            sb.append(str.charAt(i));
            while(i<n-1){
                if (str.charAt(i)==str.charAt(i+1)){
                    count++;
                    
                }
                else{
                    
                    break;
                }
                i++;
            
        }
        if(count>1){
            sb.append(count);
        }
        
    }
return sb.toString();
}
    
    public static void main(String[] args) {
        // StringBuilder s=new StringBuilder();
        // s.append("Aditya");
        // System.out.println(s);
        // StringBuilder a=touppercase("hi i am aditya");
        // System.out.println(a);
        String s= "abcd";
        String a=compression(s);
        System.out.println(a);
    }
    
}
