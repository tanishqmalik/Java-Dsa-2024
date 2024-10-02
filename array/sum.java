// import java.util.*;

// public class sum {

//     public static void main(String[] args){

    
//     Scanner scanner = new Scanner(System.in);
//     int limit = scanner.nextInt();
//     int[] arr = new int[limit];


//     int sum=0;

//     for(int i=0; i<limit; i++){
//         arr[i]=scanner.nextInt();
        
//         sum= sum +arr[i];
//         System.out.println(sum);
//     }
    

//     int avg = sum/limit;

//     System.out.println(avg);

// }

// }
public class sum {
    public static void main(String[] args) {
        String allowed = "tanishq";
        // for(int i=allowed.length()-1; i>=0; i--){
        //     System.out.println(allowed.charAt(i));
        // }
        String ka = allowed.charAt(3);
        
        System.out.println(allowed.contains(ka));
    }
}

