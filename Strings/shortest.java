public class shortest{
    static void getpath(String str){
        double x=0;
        double y =0;
        double d=0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)=='W'){
                x-=1;
            }
            else if(str.charAt(i)=='E'){
                x+=1;
            }
            else if(str.charAt(i)=='S'){
                y-=1;
            }
            else{
                y+=1;
            }
        }
        d=Math.sqrt(x*x+y*y);
        System.out.println(d);
    }
    static void substring(String s, int ei,int si){
        String str ="";
        for(int i =ei;i<si;i++){
            str+=s.charAt(i);
        }
        System.out.println(str);
    }
    public static void main(String[] args){
        String s= "WNEENESENNN";
        // getpath(s);
        System.out.println(s.substring(0,5));
        substring(s,0,3);
    }
}