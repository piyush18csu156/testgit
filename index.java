import java.util.*;
class index {
	public static void main(String args[])
	{
	Scanner consoleInput = new Scanner(System.in);
	Double[] number = new Double[10];
	int i, c=0;
	System.out.println("Enter elements of array");
	for(i=0; i<10; i++)
	number[i] = consoleInput.nextDouble();
	System.out.println("Enter a number to search: ");
	double a = consoleInput.nextDouble();
	System.out.print("Elements of array are\n");
	for(i=0; i<10; i++)
	System.out.println(+ number[i] +"  ");
	System.out.print("Index of number in array: ");
	for(i=0; i<10; i++)
	if(number[i]/a==1.0)
	{
	System.out.print(+ i +"  ");
	c++;
	}
	if(c==0)
	System.out.print("-1");
	}
}