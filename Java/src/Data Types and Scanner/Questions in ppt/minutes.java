class minutes{
	public static void main(String args[])
	{
	int m, x;
	int y, m1, d;
	m=1065600;
	System.out.println("Minutes: "+m);
	x=m/1440;
	y=x/365;
	x = x - (y*365);
	m1 = x/30;
	x = x - (m1*30);
	d = x;
	System.out.println("Years months and days: "+y +" " +m1 +" " +d);
	}
}