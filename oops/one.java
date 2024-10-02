// import java.util.*;

// public class one{
//     int id;
//     String name;


//     public static void main(String args[]){
//         one s1 = new one();
//         System.out.println(s1.id);
//         System.out.println(s1.name);
//     }
// }


// public class one{

//     // static String hello(String abc){
//     //     return abc;
//     // }

//     class cop{
//         private int gun;
//     }

//     public static void main(String args[]){

//         cop c = new cop();
//         c.gun=5;
//     }
// }


class Car{
    //fields
    String model;
    String color;
    int year;

    //constructor
    Car(String model, String color, int year){
        this.model= model;
        this.color=color;
        this.year=year;
    }

    //method
    void drive(){
        System.out.println(model+ "is driving");
    }
}

public class one {
    public static void main(String[] args) {
        Car car1 = new Car("tesla", "red", 2020);
        car1.drive();
    }
}

class Person{
    private String name;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}

class Animal{
    void eat(){
        System.out.println("this animal eats food");
    }
}