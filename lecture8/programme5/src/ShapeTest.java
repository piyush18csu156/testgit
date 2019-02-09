import java.util.*;
class ShapeTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter length and breadth of Rectangle");
		float rl,rw;
		rl = input.nextFloat();
		rw = input.nextFloat();
		Rectangle r = new Rectangle(rl,rw);
		
		System.out.println("Enter side of Square");
		float ss;
		ss = input.nextFloat();		
		Square sq=  new Square(ss);

		System.out.println("Enter radius of Circle");
		float rc;
		rc = input.nextFloat();		
		Circle c=  new Circle(rc);

		System.out.println("Rectangle: "+"\t"+r.toString());
		System.out.println("Circle: "+"\t"+c.toString());
		System.out.println("Square: "+"\t"+sq.toString());
	}
}