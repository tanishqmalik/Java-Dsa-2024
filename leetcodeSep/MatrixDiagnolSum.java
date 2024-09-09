public class MatrixDiagnolSum {
    public static void main(String args[]){
        // int result[][] = {{1,2,3},{4,5,6}, {7,8,9}};
        int result[][] = {{1,1,1,1},{1,1,1,1}, {1,1,1,1}};

        int sum=0;
        int len = result.length;
        
        int right=0;

        for(int i=0; i<result.length; i++){
            for(int j=i; j<result[0].length; j++){
                if( i== j){
                    right=i;
                    sum = sum + result[i][i] + result[i][right];
                }
            }
        }

        if(len%2!=0){
            sum= sum - result[len/2][len/2];
        }

        // int left =0;
        // int right= result[0].length;


        // for(int i=0; i<result.length; i++){
        //     for(int j=0; j<result[0].length; j++){

        //     }
        // }

        // while(right+1>=left){

        //     if(right==left){
        //         sum2=sum2-result[left][right];
        //     }

        //     sum2 = sum2 + result[left][right-1];
        //     // System.out.println(result[left][right]);


        //     left++;
        //     right--;
            
        // }
        System.out.println(sum);
    }
}
