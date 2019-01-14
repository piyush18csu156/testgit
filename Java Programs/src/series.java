import java.util.*;
class series{
	public static void main(String args[])
	{
	Scanner consoleInput = new Scanner(System.in);
	System.out.println("Enter value of x: ");
	double x = consoleInput.nextInt();
	System.out.println("Enter value of number of terms for which the sum is to be calculated:");
	double n = consoleInput.nextInt();
	int i;
	double y=1, sum=1;
	for(i=1; i<n; i++)
	{
	y = (y*x)/i;
	sum = sum + y;
	}
	System.out.println("Sum of series: 1 + x + x2/2! + x3/3! +.. is: "+sum);
	}
}