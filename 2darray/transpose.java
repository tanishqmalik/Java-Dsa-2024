// import java.util.*;

// public class transpose {
//     public static void main(String[] args){
//         int[][] a = {{1,2,3}, {4,5,6}};

//         for(int i=0; i<a.length; i++){
//             for(int j=0; j<a[0].length; j++){
//                 System.out.print(a[i][j]+" ");
//             }
//             System.out.println();
//         }


//         //transpose

//         int[][] transpose=new int[a[0].length][a.length];


//         for(int i=0; i<a[0].length; i++){
//             for(int j=0; j<a.length; j++){
//                 transpose[i][j]= a[j][i];
//             }
//         }


//         for(int i=0; i<a[0].length; i++){
//             for(int j=0; j<a.length; j++){
//                 System.out.print(transpose[i][j]);
//             }

//             System.out.println();
//         }
//     }
// }



import java.util.*;

public class transpose{
    public static void main(String args[]){
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        

        int[][] transpose = new int[arr[0].length][arr.length];


        for(int i=0; i<arr[0].length; i++){
            for(int j=0; j<arr.length; j++){
                transpose[i][j]=arr[j][i];
            }
            // System.out.println();
        }

        // for(int i=0; i<arr[0].length; i++){
        //     for(int j=0; j<arr.length; j++){
        //         System.out.print(transpose[i][j]);
        //     }

        //     System.out.println();
        // }


        for(int i=0; i<transpose.length; i++){
            for(int j=0; j<transpose[0].length; j++){
                System.out.print(transpose[i][j]);
            }

            System.out.println();
        }
    }
}