// package arrayList;

import java.util.*;

public class al {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList <String>();


        list.add("okay");
        list.add("jooo");
        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
