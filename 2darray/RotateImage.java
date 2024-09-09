public class RotateImage {
    public static void main (String args[]){
        int[][] arr= {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};

        


        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        System.out.println("-----------------");

        int rotateImage[][] = new int[arr[0].length][arr.length];

        for(int i=0; i<arr[0].length; i++){
            for(int j=arr.length-1; j>=0; j--){
                rotateImage[i][j]=arr[j][i];
            }
        }

        for(int i=0; i<arr[0].length; i++){
            for(int j=arr.length-1; j>=0; j--){
                System.out.print(rotateImage[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("-----------------");


    }
}
