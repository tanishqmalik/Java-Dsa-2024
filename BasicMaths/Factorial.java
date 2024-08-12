// import java.util.*;
public class Factorial {
    public static void main(String[] args){
        int n =5;
        int i=0;
        int fac=1;
        while(i<n){
            fac=fac*n;
            n--;
        }

        System.out.println(fac);
    }
}
