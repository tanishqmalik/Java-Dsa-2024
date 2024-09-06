import java.util.Scanner;

public class plusOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit=scanner.nextInt();
        int[] arr = new int[limit];

        for(int i=0; i<limit; i++ ){
            arr[i]=scanner.nextInt();
        }


        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==9){
                arr[i]=0;
                arr[arr.length-2]=arr[arr.length-2] +1;
                // break;
            }
            arr[i]=arr[i]+1;
            break;
        }

        // arr[arr.length-2]++;

        for(int i=0; i<limit; i++ ){
            System.out.println(arr[i]);
        }

        
    }
}



