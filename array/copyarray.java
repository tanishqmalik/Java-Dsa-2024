import java.util.*;

public class copyarray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int limit=scanner.nextInt();
        int[] arr= new int[limit];
        int[] arr2= new int[arr.length];


        for(int i=0; i<limit; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i=0; i<limit; i++){
            arr2[i]=arr[i];
        }

        for(int i=0; i<limit; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]);
        }
    }
}