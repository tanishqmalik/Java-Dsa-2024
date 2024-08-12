// import java.util.*;
// public class rotate {
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
        
//         int limit=scanner.nextInt();
        
//         int[] arr = new int[limit];
    
//         for(int i=0; i<limit; i++){
//             arr[i]= scanner.nextInt();
//         }
    
//         int k;
//         k=scanner.nextInt();
//         int j;
    
//         for(int i=0; i<k; i++){
//             for(j=0; j<limit; j++){
//                 // swap(arr[j],arr[limit-1]);
//                 int temp = arr[j];
//                 arr[j]= arr[limit-1];
//                 arr[limit-1]=temp;
//             }
//         }

//         for(int i=0; i<limit; i++){
//             System.out.println(arr[i]);
//         }
//     }

// }
// compare 2 arrays are equal or not should be input by the user



import java.util.*;

public class rotate{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        
        int[] arr= new int[limit];

        for(int i=0; i<limit; i++){
            arr[i]= scanner.nextInt();
        }

        int user= scanner.nextInt();

        for(int i=0 ; i<user; i++){
            for(int j=0; j<limit; j++){
                int temp = arr[limit-1];
                arr[limit-1]=arr[j];
                arr[j]=temp;
            }
        }

        for(int i=0; i<limit; i++){
            System.out.println(arr[i]);
        }

    }
}