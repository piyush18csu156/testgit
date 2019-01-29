class ResizableCircle extends Circle implements Resizable
{
	ResizableCircle(double radius)
	{
		super(radius);
	}
	public double Resize(double percent)
	{
		return radius=(percent/100)*radius + radius;
	}
}