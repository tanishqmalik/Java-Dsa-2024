// wap to impliment a nested class in which the data should be the input from the user and display the data 
// from excessing outside the nested class in which the outer class should be the dept contains variable or method
// and the inner class is employee that also conatain methods and variables


// Java program to demonstrate accessing
// a static nested class

// outer class
class OuterClass {

	// private int outer_x = 10;


	private int outer_y = 20;


	private static int outer_private = 30;


	static class StaticNestedClass {
		void display()
		{

			// System.out.println("outer_x = " + outer_x);

			System.out.println("outer_private = "
							+ outer_private);

			OuterClass out = new OuterClass();
			System.out.println("outer_y = " + out.outer_y);
		}
	}
}


public class StaticNestedClassDemo {
	public static void main(String[] args)
	{

		OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();

		nestedObject.display();
	}
}
