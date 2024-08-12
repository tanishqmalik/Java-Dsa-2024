import java.util.*;

public class MethodOverload {
    static int plusMetod(int x, int y){
        return x+y;
    }  

    static double plusMethod(double x, double y){
        return x+y;
    }

    public static void main(String args[]){
        int one= plusMetod(2, 5);
        double two= plusMethod(4.5, 8.9);

        System.out.println(one);
        System.out.println(two);
    }
}

// in the degree in which should be taken from the user