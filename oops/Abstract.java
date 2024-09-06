class parent2{
    abstract public parent2{
        System.out.println("Mai base2 ka constructor hu");
    }
    public void sayHello(){
        System.out.println("hello");
    }

    abstract public void greet();
    abstract public void greet2();
}


//abstract class ke saheta se concrete class bna skte ho

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
    @Override
    public void greet2(){
        System.out.println("good morning");
    }
}


//abstract class ke saheta se dusri abstarct class
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}

public class Abstract {
    public static void main(String args[]){
        
    }
}
