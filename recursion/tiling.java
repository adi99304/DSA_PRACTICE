public class tiling {
    static int  tilingproblem(int n ){
        if(n==1 || n==0){
            return 1;
        }
        int verticaltiles= tilingproblem(n-1);
        int horizontaltiles= tilingproblem(n-2);
        return verticaltiles+horizontaltiles;
    }
class Solution {
    static String remove(String s ,StringBuilder newstr , int index,boolean[] map){
        if(index == s.length()){
            return newstr.toString();
        }
        char currchar = s.charAt(index);
        if(map[currchar-'a']== true){
            return remove(s,newstr,index+1,map);
        }
        else{
            map[currchar-'a']= true;
            newstr.append(currchar);
             return remove(s,newstr,index+1,map);
        }
       
    }
    public String removeDuplicates(String s) {

        String a = remove(s,new StringBuilder(),0,new boolean[26]);
        return a;
    }
}
}
