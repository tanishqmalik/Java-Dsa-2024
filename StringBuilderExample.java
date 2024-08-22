public class StringBuilderExample {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("hello");

        sb.append("world");

        String result = sb.toString();

        System.out.println(result);
    }
}
