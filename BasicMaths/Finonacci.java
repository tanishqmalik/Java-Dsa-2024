// import java.util.*;

// public class Finonacci {
//     public static void main(String[] args){
//         int a=0,b=1;
//         int c;

//         System.out.print(a+" "+ b+" ");

//         for(int i=1; i<=10; i++){
//             c=a+b;
//             System.out.print(c+" ");
//             a=b;
//             b=c;
//         }
//         System.out.println();
//     }
// }   


// import java.util.*;

// public class Finonacci {

//     public static void main(String[] args){
//         int a=0,b=1;
//         int c;


//         System.out.print(a+" " +b+" ");

//         for(int i=1; i<=10; i++){
//             c=a+b;
//             System.out.print(c+" ");
//             a=b;
//             b=c;
//         }
//     }
// }



// recursion ????


import java.util.*;

public class Finonacci {


    static void printFibo(int count, int a, int b, int c){
        if(count>0){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);

            printFibo(count-1, a,b,c);
        }
        
    }

    public static void main(String[] args){
        int a=0,b=1;
        int c=0;
        int count =10;


        System.out.print(a+" "+b);
        printFibo(count-2, a, b, c);

        System.out.println("");

    }
}