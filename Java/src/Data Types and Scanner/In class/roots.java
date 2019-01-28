import java.util.*;
import java.lang.Math;
public class roots {
	public static void main(String args[])
	{
	Scanner consoleInput = new Scanner(System.in);
	System.out.print("Enter coefficients of quadratic equation\n");
	double a = consoleInput.nextInt();
	double b = consoleInput.nextInt();
	double c = consoleInput.nextInt();
	double d;
	d = (b*b)-(4*a*c);
	if(d>=0)
	{
	double r1, r2;
	r1 = (-b + Math.sqrt(d) )/(2*a);
	r2 = (-b - Math.sqrt(d) )/(2*a);
	System.out.println("Root 1 = " + r1);
	System.out.println("Root 2 = " + r2);
	}
	else
	{	
	System.out.println("Roots are imaginary \nTherefore, Roots are");
	System.out.println("Root 1 = "+(-b/(2*a)) + " +i" + (Math.sqrt(-d)/(2*a)) );
	System.out.println("Root 2 = "+(-b/(2*a)) + " -i" + (Math.sqrt(-d)/(2*a)) );
    }
	}
}