public class areaOfTriangle implements Area {
    public void address(){
        int length= 2;
        int b= 3;

        System.out.println(length*b);
    }

    public static void main(String args[]){
        areaOfTriangle aot = new areaOfTriangle();
        aot.address();
    }
}

interface Area{
    void address();
}
