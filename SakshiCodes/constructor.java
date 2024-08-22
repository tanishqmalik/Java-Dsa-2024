// package SakshiCodes;

class Const{
    //constructor

    Const(){
        System.out.println("hey i am a default constructor");  //call kiye bina ye cheez print hogyi aur hamne to sirf object banaya thaaa
    }

    //parameterized constructor
    String name;
    int age;

    Const(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("this is parameterized constructor named as "+name+"with age"+age);
    }



    //copy constructor
    Const(Const obj2){   // obj2 ko pass kiya is constructor mein and z as a param leliya Const lgake....
        this.name=obj2.name;
        System.out.println(name);
    }
}

public class constructor {
    public static void main(String[] args){
        Const obj = new Const(); //along with object creation ... constructor is being called automatically.
        Const obj2 = new Const("Tanishq", 19);
        Const obj3 = new Const(obj2);


    }
}
//rules of constructor
// 1. return type nhi haiiii
// 2. Name same as class name
// 3. ek baar call kr skte ho

