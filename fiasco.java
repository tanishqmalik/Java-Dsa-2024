// public class fiasco {
//     public static void main(String args[]) {
//         System.out.println("Hello World");
//     }
// }

// import java.util.*;

// public class fiasco{
//     public static void main(String args[]){
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter an integer");

//         int n = scanner.nextInt();

//         System.out.println(n);

//         scanner.close();
//     }
// }



// import java.util.Scanner;

// public class fiasco {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.println("Enter your name:");
//         String name = scanner.nextLine();
        
//         System.out.println("Enter your age:");
//         int age = scanner.nextInt();
        
//         System.out.println("Your name is " + name + " and your age is " + age);
        

//         scanner.close();
//     }
// }



// import java.util.*;

// public class fiasco {
//     public static void main(String args[]){
//         final int myNum = 15;
//         String carName = "Volvo";
//         // myNum = 20;
//         System.out.println(carName);
//     }
// }

// wap to declare many variables with many values and display the values


// public class fiasco {
//     public static void main(String args[]){
//      String firstName = "Tanishq";
//       String LastName = "Malik";
//        String Number = "9499249235";
//         // myNum = 20;
//         System.out.print(firstName+ " "+ LastName+ " " + " " +Number);
//         System.out.println("");
//         System.out.println(firstName);
//         System.out.println(LastName);
//         System.out.println(Number);
//     }
// }


// public class fiasco {
//     public static void main(String args[]){
//      int length = 20;
//       int width = 10;
//         // myNum = 20;
//         System.out.println("length : "+ length);
//         System.out.println("width : "+ width);
//         System.out.println("area : " +length*width);
//     }
// }


//widening small to larger

// public class fiasco {
//     public static void main(String[] args) {
//         int intValue = 100;
//         long longValue = intValue; // Implicit typecasting
//         double doubleValue = longValue; // Implicit typecasting

//         System.out.println("Integer value: " + intValue);
//         System.out.println("Long value: " + longValue);
//         System.out.println("Double value: " + doubleValue);
//     }
// }


// for upper casing

// public class fiasco {
//     public static void main(String[] args) {
//         String var = "tanishq";

//         System.out.println(var.toUpperCase());
//         System.out.println(var.indexOf('n'));
//     }
// }

// wap a java program in all loops to print number series from 0 to 10
// ------------------------------- odd numbers 



public class fiasco {
    public static void main(String[] args) {

        System.out.println("numbers upto 10");

        for(int i=0; i<10; i++){
            System.out.println(i);
        }

        System.out.println("even numbers");


        for(int i=0; i<10; i++){
            if( i%2==0){
                System.out.println(i);
            }
        }
    }
}
