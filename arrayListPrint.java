public class class {
    import java.util.*;

public class arrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Rahul");
        list.add("Jai");

        for (String name: list) {
            System.out.println(name);
        }

        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
}
