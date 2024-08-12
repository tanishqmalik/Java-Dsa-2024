import java.util.*;

public class transpose {
    public static void main(String[] args){
        int[][] a = {{1,2,3}, {4,5,6}};

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


        //transpose

        int[][] transpose=new int[a[0].length][a.length];


        for(int i=0; i<a[0].length; i++){
            for(int j=0; j<a.length; j++){
                transpose[i][j]= a[j][i];
            }
        }


        for(int i=0; i<a[0].length; i++){
            for(int j=0; j<a.length; j++){
                System.out.print(transpose[i][j]);
            }

            System.out.println();
        }
    }
}