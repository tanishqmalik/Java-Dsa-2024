// package LinkedList;

// insertion - lL
// search - aL

public class aC {

    Node head;
    public int size;

    aC(){
        this.size =0;
    }

    class Node{
        String data;
        Node next;


        Node(String data){
            this.data = data;
            this.next = null;
            size ++;
        }
    }

    //add - first, last

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head= newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("cannot delete, becz list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("cannot delete last element, because list is empty");
            return;
        }

        if(head.next ==null){
            head = null;
            return;
        }
        size--;

        Node secLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secLastNode = secLastNode.next;
        }
        secLastNode.next = null;
    }


    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode= currNode.next;            
        }

        System.out.println("null");
        // System.out.println();
    
    }

    public int getSize(){
        return size;
    }


    public static void main(String args[]){
        aC list = new aC();
        list.addFirst("a");
        list.addFirst("is");
        // list.printList();
        // System.out.println();

        list.addLast("list");
        list.addFirst("this");
        list.printList();
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        
    }
}
