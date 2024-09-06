public class merge {
    public static void main(String args[]){
        // int[] arr1 = {1,2,3,4,5};
        // int[] arr2 = {6,7,8,9,0};

        // int[] ans = new int[arr1.length + arr2.length];

        // for(int j=0; j<arr1.length; j++){
        //     ans[j] = arr1[j];
        // }

        // int j = 0;
        // boolean check = false;
        // for(int i = arr1.length; i<(arr1.length + arr2.length); i++) {
        //     int l = i;
        //     while(j<arr2.length && l<(arr1.length + arr2.length)) {
        //         ans[l] = arr2[j];
        //         j++;
        //         l++;
        //     }
        //     check=true;
        //     if(check) {
        //         break;
        //     }
        // }

        // for(int i = 0; i<ans.length; i++) {
        //     System.out.println(ans[i] + " ");
        // }

        int[] arr = {1,2,3,4,5};
        int k = 2;



        for(int i = arr.length - k; i<arr.length; i++) {
            if(i<0) {
                continue;
            }
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i<arr.length - k; i++) {
            System.out.print(arr[i] + " ");
        }

        }
}
