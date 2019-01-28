/*Each class definition is stored in its own .java file*/
abstract class Shape {
	double side1;
	double side2;
	Shape(double l, double b)
	{
	side1 = l;
	side2 = b;
	}
	abstract void display_area();
}