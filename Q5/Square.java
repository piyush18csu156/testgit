class Square extends Rectangle
{
	Square()
	{
		super();
		length=1;
		width=1;
	}
	Square(double a)
	{
		super();
		length=a;
		width=a;
	}
	Square(double a,boolean f,String c)
	{
		super(a,a,c,f);
		setWidth(a);
		setLength(a);
	}
	void setSide(double a)
	{
		setLength(a);
		setWidth(a);
	}
	double getSide()
	{
		return getLength();
	}
	void setWidth(double a)
	{
		width = a;
	}
	void setLength(double a)
	{
		width = a;
	}
	public String toString()
	{
		return (getColor()+"\t"+isFilled()+"\t"+getLength()+"\t"+getWidth()+"\t"+getArea()+"\t"+getPerimeter());
	}
}