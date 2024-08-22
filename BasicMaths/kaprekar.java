// import java.lang.*; 

public class kaprekar {
    public static void main(String[] args){
        int n =01;
        int temp0 = n;
        int temp = n*n;


        String s1  = Integer.toString(temp);

        int len = s1.length();


        String leftPart = s1.substring(0, len/2);
        String righPart = s1.substring(len/2);

        int leftNum = Integer.parseInt(leftPart);
        int rightNum = Integer.parseInt(righPart);

        if(leftNum+rightNum == n ){
            System.out.println("yes kaprekar");
        }
        else if(n==1){
            System.out.println("yes a kaprekar");
        }
        else{
            System.out.println("not a kaprekar");
        }


        
    }
}
