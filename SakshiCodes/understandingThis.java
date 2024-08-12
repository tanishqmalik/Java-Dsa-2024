// package SakshiCodes;

class keyword{
    String name;
    int id;
    char batch;
    void walk(){
        System.out.println("i can walk");
    }
    void talk(){
        System.out.println("I can talk");
    }
    void print(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(batch);

        walk();
        talk();
    }
}

public class understandingThis {
    public static void main(String[] args){
        keyword tanishq1 = new keyword();

        tanishq1.name= "tanishq";
        tanishq1.id=23;
        tanishq1.batch='A';

        keyword tanishq2= new keyword();
        tanishq2.name= "tanishq";
        tanishq2.id=85;
        tanishq2.batch='u';

        keyword tanishq3= new keyword();
        tanishq3.name= "tanishq";
        tanishq3.id=12;
        tanishq3.batch='q';


        tanishq1.print();
    }
}

