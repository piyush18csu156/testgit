/*Each class definition is stored in its own .java file*/
class Rectangle extends Shape {
	Rectangle(double l, double b)
	{
	super(l,b);    //Base class constructors are invoked using super keyword
    }	
	void display_area() {
	double c = side1*side2;
	System.out.print("\nArea of Rectangle = "+c);
	}
}