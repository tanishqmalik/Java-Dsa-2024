import java.util.*; 

public class PrintPrimeNums {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int last= scanner.nextInt();
        
        int cnt=0;
        for(int i=1; i<=last; i++){
            for(int j=2; j<i-1; j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt==0){
                System.out.println(i);
            }
            else{
                cnt=0;
            }
        }
    }
}
