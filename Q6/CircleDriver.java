class CircleDriver
{
	public static void main(String[] args) {
		ResizableCircle c = new ResizableCircle(5);
		System.out.println("Perimeter = "+c.getPerimeter());
		System.out.println("Area = "+c.getArea());
		System.out.println("Resize = " +c.Resize(40));
		System.out.println("Resized Perimeter = "+c.getPerimeter());
		System.out.println("Resized Area = "+c.getArea());
	}
}
