// package BasicRecursion;

import java.util.Scanner;
public class printNameNtimes {

    static void reCall(int n,int count, String input){
        if(count==n){
            return;
        }
        System.out.println(input);
        count++;
        reCall(n, count, input);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input =  scanner.nextLine();

        int n=scanner.nextInt();
        
        int count=0;

        reCall(n,count,input);
    } 
}
