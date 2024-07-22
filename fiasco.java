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


//         System.out.println("Enter your number:");
//         int number = scanner.nextInt();
        
//         System.out.println("Your name is " + name + " and your age is " + age + " " + number +" ");
//         System.out.println(name.length());

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



// public class fiasco {
//     public static void main(String[] args) {

//         System.out.println("numbers upto 10");

//         for(int i=0; i<10; i++){
//             System.out.println(i);
//         }

//         System.out.println("even numbers");


//         for(int i=0; i<10; i++){
//             if( i%2==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }


// wap to impliment calculator in which input is taken from user
// ------------------ to find the factorial of a number in which input is taken from the user. take double 
// ------------------- to find the fibonacci series


// wap to calculate the gross salary of the employee  and also display the gross salsry in whuc


// import java.util.*;

// public class fiasco{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         int bs= scanner.nextInt();
//         int hra = scanner.nextInt();
//         int bsp = (5)*bs/100;
//         int da = scanner.nextInt();
//         int ta = scanner.nextInt();

//         int result = bs + (10*hra)/100 + da*(bsp) + ta*bsp ;


//         System.out.println(result);

//     }
// }


// impliment calculator in java to perform all the basic airthmatic operation
// in which all input should be taken from user


// functions


// import java.util.*;

// public class fiasco{
//     static void myMethod(String fname){
//         System.out.println("hello" + fname);
//     }

//     public static void main(String[] args){
        
//         myMethod("hello");
//     }
// }


// wap to display the basic report of stdent first name last name mail ph. number
// in which all input should be taken from user


// import java.util.*;

// public class fiasco{
//     // Scanner scanner = new Scanner(System.in);
//     static void student(String name, int age , String mail){

//         System.out.println(name +age + mail);
//     }

//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         String name = scanner.nextLine();
//         int age = scanner.nextInt();
//         // System.out.println();
//         // scanner.nextLine();
//         String mail = scanner.nextLine();

//         student(name,age, mail);
//     }
// }


// to impliment calculator with the help of user defined function and input is taken from user



// wap to reverse a string



// import java.util.*;

// public class fiasco{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);

//         String ab = "tanishq";
//         String result= "";

//         int sum =0;


        
//         int limit = scanner.nextInt();

//         int[] arr = new int[limit];

//         for(int i=0; i<limit; i++){
//             arr[i]=scanner.nextInt();
//         }

//         for(int i=0; i<arr.length; i++){
//             sum = sum + arr[i];
//         }


//         System.out.println(sum);


//         for(int i=ab.length()-1; i>=0; i--){
//             result = result + ab.charAt(i);
//         }

//         System.out.println(result);
//     }
// }


// wap to impliment fibonacci series