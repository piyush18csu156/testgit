/*4.Create an abstract base class called Shape. Use this class to store two double type values that could be used to compute the area of figures. Create two specific inherited classes called Triangle and Rectangle from the base class Shape. Add to base class an abstract member function display_area(). Write a test application ShapeTest that demonstrates the capabilities of the classes defined above.

   Definition of Done:
a)	The class definitions are defined as per the class diagram.
b)	Each class definition is stored in its own .java file.
c)	Base class constructors are invoked using super keyword.
d)	Function overriding is applied wherever applicable.
*/
import java.util.*;
class shapeTest {
	public static void main(String args[])
	{
	Scanner consoleInput = new Scanner(System.in);
	Triangle t = new Triangle(20,30);
	Rectangle r = new Rectangle(10,20);
	Shape s;
	s = t;
	t.display_area();
	s = r;
	r.display_area();
	}
}