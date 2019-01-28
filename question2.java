import java.util.*;
class question2
{
	public static void main(String args[])
	{
	Scanner consoleInput = new Scanner(System.in);
	Vechile v = new Vechile();
	Car c = new Car();
	Bike b = new Bike();
	System.out.print("Enter number of tyres : ");
	int N = consoleInput.nextInt();
	switch(N)
	{
	case 2 : b.display();
	break;
	case 4 : c.display();
	break;
	default : v.display();
	}
	}
}