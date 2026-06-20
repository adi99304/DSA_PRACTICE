package HW;

public class hwtdarrays {
    static int seven(int[][] matrix,int key){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    count++;
                }
            }
        }
        return count;
    }
    static void secsum(int[][] matrix){
            int sum=0;
            int j =0;
            while(j<matrix[0].length){
                System.out.print(matrix[1][j]+" ,");
                sum=sum+matrix[1][j];
                j++;
            }
            System.out.println("sum"+sum);
        
    }
    static void transpose(int[][] matrix){
        // for(int i=0;i<matrix.length;i++){
        //     for(int j =i+1;j<matrix[0].length;j++){
        //         int temp=0;
        //         temp=matrix[i][j];
        //         matrix[i][j]=matrix[j][i];
        //         matrix[j][i]=temp;
        //     }
        // }
        int[][] trans= new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                
                trans[j][i]=matrix[i][j];
                
            }
        }

        for(int i=0;i<trans.length;i++){
            for(int j =0;j<trans[0].length;j++){
                System.out.print(trans[i][j]+ ",");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] array={{4,7,8},{8,8,7}};
        int[][] nums = { {1,4,9},{11,4,3}};
        // int s=seven(array,7);
        // System.out.println("count : "+s);
        transpose(nums);
    }
}
