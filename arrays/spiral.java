public class spiral{
    static void spiral(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int startrow=0;
        int endrow= n-1;
        int startcol= 0;
        int endcol= m-1;
        while(startrow<=endrow&& startcol<=endcol){
            for(int j =startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j] +" ");
            }
            for(int i = startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            for(int j= endcol-1;j>=startcol;j--){
                System.out.print(matrix[endrow][j]+" ");
            }
            for(int i=endrow-1;i> startrow;i--){
                System.out.print(matrix[i][startcol]+" ");
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
    }
    static void diagonl(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int sum =0;
        int sum1=0;
        for(int i =0;i<n;i++){
            sum=sum+matrix[i][i];
        }
        int i =0;
        int j =n-1;
        while(i!= n){
            if(i==j){
                i++;
                j--;
                continue;
            }
            sum1=sum1+matrix[i][j];
            i++;
            j--;
        }

        System.out.println(sum+sum1);
    }
    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] g= {{1,2,3},{4,5,6},{7,8,9}};
        // spiral(arr);
        diagonl(g);
    }
}