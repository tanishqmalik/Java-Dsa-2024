public class insert1 {

    Node head;

    class Node{
        int data;
        Node next;


        Node(int data){
            this.data= data;
            this.next = null;
        }
    }


    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        newNode.next= head;
        head=newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("empty list");
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data);
            currNode= currNode.next;
        }

        

    }
    public static void main(String args[]){
        insert1 list = new insert1();
        list.insertAtFirst(3);
        list.insertAtFirst(34);
        list.print();
    }
}
