public class StringBufferExample {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Hello");

        sb.append("world");

        sb.insert(5, "java");

        sb.reverse();

        String result = sb.toString();

        System.out.println(result);
    }
}
