// import java.util.Scanner;

// public class checkPal {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int n = scanner.nextInt();
//         int rn = 0;
//         int dup = n;
//         while (n > 0) {
//             int lastD = n % 10;
//             rn = (rn * 10) + lastD;
//             n = n / 10;
//         }
//         if (dup == rn) {
//             System.out.println("palindrome");
//         } else {
//             System.out.println("nope");
//         }
//         scanner.close();
//     }
// }

// palindrome for number

// import java.util.*;

// public class checkPal{
//     public static void main(String[] args){
//         int num = 121;

//         int rn =0;
//         int dup= num;

//         while(num>0){
//             int lastD = num%10;
//             rn= (rn*10)+lastD;
//             num= num/10;
//         }

//         if(dup==rn){
//             System.out.println("yes");
//         }
//         else{
//             System.out.println("no");
//         }
//     }
// }


// palindrome for string


import java.util.*;

public class checkPal {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String initial = scanner.nextLine();

        String result="";

        for(int i=initial.length()-1; i>=0; i--){
            result= result+ initial.charAt(i);
        }

        System.out.println(result);

        if(initial==result){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}


