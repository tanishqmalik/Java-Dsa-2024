public class tanishq implements Student {
    public void name(){
        System.out.println("Name of the Student is tanishq");
    }

    public void address(){
        System.out.println("Address of student is chandigarh");
    }
    public static void main(String args[]){
        tanishq t = new tanishq();
        t.name();
        t.address();
    }
}

interface Student{
    void name();
    void address();
}

// wap to display area of triangle 