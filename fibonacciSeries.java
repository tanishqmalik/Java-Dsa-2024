public class fibonacciSeries {
    public static void main(String args[]){
        int a=0;
        int b=1;


        int n=15;

        System.out.print(a);
        System.out.println(b);


        for(int i=0; i<n; i++){
            int c = a+b;
            
            a=b;
            b=c;
            System.out.print(c + " ");

            if(c>=6-2){
                break;
            }
        }
    }
}
