import java.util.*;

public class frequency{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit=scanner.nextInt();
        int[] arr = new int[limit];
        int count =0;
        int fr[] = new int[limit];
        int visited=-1;


        for(int i=0; i<limit; i++){
            arr[i]=scanner.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            count=1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;

                    fr[j]=visited;
                }
            }

            if(fr[i]!=visited){
                fr[i]=count;
            }
        }

        for(int i=0; i<fr.length; i++){
            if(fr[i]!=visited){
                System.out.println(arr[i]+ " "+" " + fr[i]);
            }
            
        }

    }
}