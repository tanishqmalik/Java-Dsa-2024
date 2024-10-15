// package sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = scanner.nextInt();

        int arr[] = new int[limit];

        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }


        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int element : arr){
            System.out.println(element);
        }
    }
}
