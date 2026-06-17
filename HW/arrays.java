package HW;

public class arrays {
    public static void main(String[] args) {
        int[] r = {1,2,3,4};
        for(int i =0;i<r.length;i++){
            for(int j =i+1;j<r.length;j++){
                if(r[i]==r[j]){
                    System.out.println(true);
                }
                
            }
        }
        System.out.println(false);
    }
}
