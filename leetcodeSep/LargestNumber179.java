import java.util.ArrayList;

public class LargestNumber179 {
    public static void main(String args[]){

        int nums[]  = {3,30,34,5,9};

        ArrayList<String> list = new ArrayList<>();


        String concat = "";
    

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                String final1 = Integer.toString(nums[i]);
                String final2 = Integer.toString(nums[j]);

                concat = final1 + final2;
                list.add(concat);
            }
            
        }
        System.out.println(list);
    }
}
