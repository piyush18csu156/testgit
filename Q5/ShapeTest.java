import java.util.*;
class ShapeTest
{
	public static void main(String[] args)
	{
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter length and breadth of Rectangle");
		float rectlength,rectbreadth;
		rectlength = consoleInput.nextFloat();
		rectbreadth = consoleInput.nextFloat();
		Rectangle rect = new Rectangle(rectlength,rectbreadth);
		
		System.out.println("Enter side of Square");
		float side;
		side = consoleInput.nextFloat();		
		Square sqr =  new Square(side);

		System.out.println("Enter radius of Circle");
		float rad;
		rad = consoleInput.nextFloat();		
		Circle cir =  new Circle(rad);

		System.out.println("Rectangle: "+"\t"+rect.toString());
		System.out.println("Square: "+"\t"+sqr.toString());
		System.out.println("Circle: "+"\t"+cir.toString());
	}
}