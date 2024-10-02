// package strings;

public class removeDuplicates {
    public static void main(String[] args) {
        String hello = "abccd";
        String hello2 = "";

        for(int i=0; i<hello.length()-1; i++){
            if(hello.charAt(i) != hello.charAt(i+1)){
                hello2 += hello.charAt(i);
            }
        }
        System.out.println(hello2);
    }
}
