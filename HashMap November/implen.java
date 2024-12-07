import java.util.HashMap;

public class implen {
    public static void main(String args[]){
        HashMap<String,Integer> map = new HashMap<>();

        map.put("Alice", 30);
        map.put("Bob", 40 );
        map.put("Charlie", 35);


        System.out.println(map.get("Alice"));
        System.out.println(map.get("Charlie"));
        map.remove("Alice");
        System.out.println(map.get("Alice"));


        if(map.containsKey("Bob")){
            System.out.println(map.get("Bob"));
        }

        if(map.containsValue(35)){
            System.out.println("Someone is 35 ");
        }
        else{
            System.out.println("NO");
        }


    }
}
