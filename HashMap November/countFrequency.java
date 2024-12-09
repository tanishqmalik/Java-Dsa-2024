
import java.util.HashMap;

// package HashMap November;

// public class countFrequency {
//     public static void main(String[] args) {
//         int arr[] = {10,5,10,15,10,5};

//         boolean visited[] = new boolean[arr.length];

//         for(int i=0; i<arr.length; i++){
//             if(visited[i]==true){
//                 continue;
//             }

//             int count = 1;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i]==arr[j]){
//                     visited[j]=true;
//                     count++;
//                 }
//             }

//             System.out.println(arr[i] +":"+ count);

//         }
//     }
// }

// by hasmap

public class countFrequency {
    public static void main(){
        int arr[]={12 , 3 , 55, 12, 2, 55,3, 12};

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1 );
            }
            else{
                hm.put(arr[i], 1);
            }
        }

        System.out.println(hm);
    }
}