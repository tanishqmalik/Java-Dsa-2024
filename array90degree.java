import java.util.*;

public class array90degree {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        //output 4 5 1 2 3
        int k = sc.nextInt();

        k = k%arr.length;

        // 5 4 3 2 1
        reverse(arr, 0,arr.length-1);

        reverse(arr, 0, k-1);

        reverse(arr, k, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


    }


    static void reverse(int array[], int start, int end){
        while(end>start){
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;
            end--;
            start++;
        }
    }
}
