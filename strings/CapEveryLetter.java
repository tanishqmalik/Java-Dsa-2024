// package strings;

import java.util.Scanner;

public class CapEveryLetter {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        String ab = sc.nextLine();

        char first = ab.charAt(0);

        first = Character.toUpperCase(first);

        String updated =first + ab.substring(1);

        System.out.println("output2 :" + updated);

        for(int i=0; i<ab.length(); i++){
            if(updated.contains(" ")){
                int index = updated.indexOf(" ")+1;
                char gapPrevious1 = updated.charAt(index);
                char gapPrevious2 = Character.toUpperCase(gapPrevious1);
    
                
    
                String updated2 = updated.substring(0, index);
    
                updated2 = updated2 + gapPrevious2;
    
                // System.out.println(updated2);
                // char temp = gapPrevious1;
                // gapPrevious1 = gapPrevious2;
                // gapPrevious2 = temp;
    
                System.out.println(updated2);
            }
        }




        



        // System.out.println(indexGap);


        
    }
}
