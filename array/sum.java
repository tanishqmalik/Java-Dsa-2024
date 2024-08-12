

import java.util.*;

public class sum {

    public static void main(String[] args){

    
    Scanner scanner = new Scanner(System.in);
    int limit = scanner.nextInt();
    int[] arr = new int[limit];


    int sum=0;

    for(int i=0; i<limit; i++){
        arr[i]=scanner.nextInt();
        sum= sum +arr[i];
    }
    System.out.println(sum);

    int avg = sum/limit;

    System.out.println(avg);

}

}
