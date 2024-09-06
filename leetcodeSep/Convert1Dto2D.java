// package leetcodeSep;

public class Convert1Dto2D {

    public static void main(String args[]){
        int arr[] = {1,2,3,4};

        int m=2;
        int n=2;


        int result[][]= new int[m][n];

        if(arr.length!=m*n){
            result[m][n];
        }

    
        for(int i=0; i<arr.length; i++){
            int row = i/n;
            int col = i%n;
    
            result[row][col]= arr[i];
        }


    
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result.length; j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}