public class SpiralMatrix {
    public static void main(String args[]){
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};


        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("--------");

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            if(i==0){
                break;
            }
            System.out.println();
        }
        // System.out.print();






    }
}
