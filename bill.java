import java.util.*;
public class bill {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float compass = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total= pencil+compass+eraser;
        float gst = 0.18f*(total) +total;
        System.out.println(total);
        
    }
}
