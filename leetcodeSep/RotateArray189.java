//brute force

// public class RotateArray189 {
//     public static void main(String args[]){
//         // int arr[] = {1,2,3,4,5,6,7};
//         int arr[] = {-1,-100,3,99};
        

//         int k=2;

//         for(int i=0; i<k; i++){
//             for(int j=0; j<arr.length; j++){
//                 int temp = arr[j];
//                 arr[j]=arr[arr.length-1];
//                 arr[arr.length-1]=temp;
//             }
//         }


//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }




public class RotateArray189{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int k=3;

        k=k%arr.length;

        reverse(arr, 0, arr.length-1);

        reverse(arr, 0, k-1);

        reverse(arr, k, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }


    public static void reverse(int arr[], int start, int end){

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }


}





