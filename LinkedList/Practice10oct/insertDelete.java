// package LinkedList.Practice10oct;



public class insertDelete {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next = null;
        }
    }

    // insert front and back

    public void insertFront(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head= newNode;
    }

    public void insertLast(int data){

        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node currNode= head;
        while (currNode.next!=null) {
            currNode=currNode.next;
        }

        currNode.next = newNode;
        newNode.next= null;
    }

    // delete front and back


    public void deleteFirst(){
        head=head.next;

        // System.out.println("Now head is" + head.data);
    }

    public void deleteLast(){
        Node LastNode = head.next;
        Node SecLastNode =  head;
        while(LastNode.next != null){
            LastNode=LastNode.next;
            SecLastNode=SecLastNode.next;
        }
        SecLastNode.next=null;
    }

    public void print(){
        Node currNode = head;
        while(currNode!= null){
            System.out.print(currNode.data+ "->");
            currNode=currNode.next;
        }

        System.out.println("null");
    }


    public static void main(String args[]){
        insertDelete list = new insertDelete();
        list.insertFront(3);
        list.insertFront(2);
        list.insertFront(1);
        list.insertLast(4);
        list.insertFront(1000);
        list.deleteFirst();
        list.deleteFirst();
        list.insertFront(1000);
        list.deleteFirst();
        list.insertFront(1);
        list.deleteFirst();
        list.insertFront(1);
        list.deleteLast();
        list.deleteLast();
        list.insertLast(3);
        list.insertLast(4);
        
        list.print();
    }
}