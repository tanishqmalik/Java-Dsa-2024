import java.util.*;

public class ascending{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int limit= scanner.nextInt();
        

        int[] a = new int[limit];

        for(int i=0; i<limit; i++){
            a[i]= scanner.nextInt();
        }


        for(int i=0; i<limit; i++){
            for(int j=i+1; j<limit; j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]= a[j];
                    a[j]=temp;
                }
            }
        }

        for(int i=0; i<limit; i++){
            System.out.print(a[i]+" ");
        }

       
    }
}