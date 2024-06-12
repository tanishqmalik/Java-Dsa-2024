// package BasicRecursion;

import java.util.Scanner;
public class reverseAnArray {

    static void reCall(int arr[], int start, int end){
        if(start< end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;

            start++;
            end--;
            reCall(arr, start, end);
        }        
    }


    static void print(int arr[],int limit){
        for(int i=0; i<limit; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int arr[]=new int[1000];
        int limit=scanner.nextInt();

        for(int i=0; i<limit; i++){
            arr[i]= scanner.nextInt();
        }

        int start = 0;
        int end = limit-1;

        reCall(arr, start , end);
        
        print(arr,limit);
    }
}