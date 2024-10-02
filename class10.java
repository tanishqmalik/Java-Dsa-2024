import java.util.*;

public class class10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Tanishq");
        list.add("Malik");

        for (String name: list) {
            System.out.println(name);
        }

        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
