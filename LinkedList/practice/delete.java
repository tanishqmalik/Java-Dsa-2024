public class delete {

    Node head;
    public int size;


    delete(){  //delete
        this.size = 0;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertFirst(int data){
        Node newNode =new  Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    public void print(){
        Node currNode = head;

        if(head == null){
            System.out.println("list is empty");
            return;
        }

        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }

        System.out.println("null");

    }

    public void deleteFirst(){
        // if(head == null){

        // }
        head = head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("Nothing here to delete from last");
            return;
        }

        if(head==null){
            head=null;
            return;
        }

        Node secondLast = head;
        Node Last = head.next;

        while(Last.next != null ){
            Last = Last.next;
            secondLast = secondLast.next;
            // System.out.println(secondLast.data);
        }
        secondLast.next = null;

    }

    public int getSize(){
        return size;
    }

    public static void main(String args[]){
        delete list = new delete();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.deleteFirst();
        list.deleteLast();
        // list.deleteFirst();
        
        list.print();
    }
}
