// package Oct10ArraysSimple;

import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        

        int limit;
        limit = scanner.nextInt();
        int arr[] = new int[limit];

        int elementToDelete = scanner.nextInt();

        for(int i=0; i<limit; i++){
            arr[i]= scanner.nextInt();
        }

        System.out.println("Printling firstTime");
        for(int i=0; i<limit; i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();

        System.out.println("Printling LastTime");
        for(int i=0; i<limit; i++){
            if(elementToDelete-1==i){
                continue;
            }
            System.out.print(arr[i] + " ");
            
        }



    }
}
