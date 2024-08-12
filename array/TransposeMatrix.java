import java.util.*;
public class TransposeMatrix {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        int rows= scanner.nextInt();
        int cols= scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        int[][] Tmatrix = new int[cols][rows];


        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j]=scanner.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                Tmatrix[j][i]=matrix[i][j];
            }
        }

        System.out.println("Transpose");
        for(int i=0; i<rows; i++){
            for(int j =0 ; j<cols; j++){
                System.out.print(Tmatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
