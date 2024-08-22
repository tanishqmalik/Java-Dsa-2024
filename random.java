public class random {
    public static void main(String[] args){
        int n=2;
        int result= n-1;
        int result2 = result-1;

        int result3 = n-2;
        // int result3 = result+result2;
        // System.out.println(result);x

        System.out.println(result2);
        

        if(result3==1){
            result3=1;
        }
        if(result3==0){
            result3=0;
        }
        // System.out.println(result);

        System.out.println(result3);

        System.out.println(result2+result3);
    }
}