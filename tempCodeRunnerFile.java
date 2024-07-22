import java.util.*;

public class fiasco{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String ab = "tanishq";
        String result= "";

        int sum =0;


        
        int limit = scanner.nextInt();

        int[] arr = new int[limit];

        for(int i=0; i<limit; i++){
            arr[i]=scanner.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }


        System.out.println(sum);


        for(int i=ab.length()-1; i>=0; i--){
            result = result + ab.charAt(i);
        }

        System.out.println(result);
    }
}