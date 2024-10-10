import java.util.LinkedList;
import java.util.Queue;


// linked list is class
// queue is interface


public class one {
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<>();

        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        queue.remove(4);


        for(int r: queue){
            System.out.println(r);
        }

        System.out.println("peek:- "+ queue.peek());

        System.out.println("poll:- "+ queue.poll());  

        System.out.println("poll:- "+ queue.peek());
    }
}
