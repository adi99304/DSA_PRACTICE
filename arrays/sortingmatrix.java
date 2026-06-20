package arrays;
public class sortingmatrix{
    static void sorting(int [][] matrix,int key){
        int row=0; int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("found key"+" "+"row : "+row+" "+"col: "+col);
                break;
            }
            else if(matrix[row][col]<key){
                row++;
            }
            else if (matrix[row][col]>key){
                col--;
            }
            else{
                System.out.println("key not found");
            }
        }
        
    }
    public static void main(String[] args) {
        int [][] arr={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        sorting(arr,32);
    }
}