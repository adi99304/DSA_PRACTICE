public class incometaxcal {
    public static void main(String[] args){
        int a =700000;
        if(a<500000){
            System.out.println("0% tax" + a);
        }
        else if (a>500000 && a<=700000){
            float b =0.20f* a + a;
            System.out.println("20 % tax"+ " " +b);
        }
        else {
            float c= 0.30f * a+a ;
            System.out.println("30% tax"+ c);
        }
    }
}
