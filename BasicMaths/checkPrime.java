// import java.util.*;

// public class checkPrime{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         int n =scanner.nextInt();
//         int cnt=0;
//         for(int i=1; i<=n; i++){
//             if(n%i==0){
//                 cnt = cnt+1;
//             }
//         }

//         if(cnt==2){
//             System.out.println("okay");
//         }
//         else{
//             System.out.println("null");
//         }
//     }
// }


import java.util.Scanner;

public class checkPrime{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();
        int cnt=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                cnt=cnt+1;
            }
        }
        scanner.close();

        if(cnt==2){
            System.out.println("okay");
        }
        else{
            System.out.println("null");
        }
    }
}

