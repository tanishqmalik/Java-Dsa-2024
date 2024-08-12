

import java.util.*;

public class largest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int limit= scanner.nextInt();
        

        int[] a = new int[limit];

        for(int i=0; i<limit; i++){
            a[i]= scanner.nextInt();
        }

        int max = a[0];
        int s_max=0;


        for(int i=0; i<limit; i++){
            if(a[i]>max){
                max=a[i];
            }
            else if(s_max< max && s_max<a[i]){
                s_max=a[i];
            }
        }

        System.out.println(s_max);
    }
}
