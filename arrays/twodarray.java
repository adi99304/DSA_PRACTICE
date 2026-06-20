import java.util.*;
public class twodarray{
    static boolean search(int[][] matrix, int key){
        for(int i=0;i<matrix.length;i++)
        {
            for(int j =0;j<matrix[0].length;j++){
                if(key==matrix[i][j]){
                    System.out.println("key found");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;    
    }
    public static void main(String[] args) {
        int[][] arr= new int[3][3];
        int n =arr.length , m=arr[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                int a = sc.nextInt();
                arr[i][j]=a;

            }
        }
        // for(int i =0;i<n;i++){
        //     for(int j =0;j<m;j++){
        //         System.out.print(" ,"+arr[i][j]);
        //     }
        //     System.out.println();
        // }
        search(arr,12);
    }
}