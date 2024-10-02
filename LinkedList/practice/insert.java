public class insert {
    Node head;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }


    //insert at first

    public void addFirst(String data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head= newNode;
    }

    //insert at last

    public void addLast(String data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            return;
        }

        Node currNode = head;

        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.next= null;
    }

    public void printList(){

        if(head == null){
            System.out.println("empty list");
        }
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data);
            currNode = currNode.next;
        }
    }

    public static void main(String args[]){
        insert list = new insert();
        list.addFirst("first");
        list.addFirst("hello");
        list.addLast("byeee");
        list.printList();
    }
}



