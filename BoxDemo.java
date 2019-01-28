class Box{
	double width;
	double height;
	double depth;
	void setdim(){
	width = 10;
	height = 10;
	depth = 10;
	}
	double volume(){
	return height*width*depth;
	}
}
class BoxDemo {
	public static void main(String args[])
	{
    double x;
	Box box1 = new Box();
	box1.setdim();
	x = box1.volume();
	System.out.println("Volume = " + x);
	}
}