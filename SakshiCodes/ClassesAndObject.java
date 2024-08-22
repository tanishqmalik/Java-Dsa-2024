// package SakshiCodes;

class newClass{
    int x =25;
    public void fun(){
        System.out.println("hey");
    }
}

public class ClassesAndObject {
    public static void main(String[] args){
        newClass obj = new newClass(); //new object bna liya  objects store hote hai heap mein...new keyword in java used to allocate memory for the object
        System.out.println(obj.x);
        obj.x=55;
        System.out.println(obj.x);
        obj.fun();
    }
}

//properties

//abstraction
//polymorphism
//inheritance
//encapsulation


