import java.util.*;
class number {
	public static void main(String args[])
	{
	Scanner consoleInput = new Scanner(System.in);
	Double number[] = new Double[5];
	int i, j, c=0, d;
	System.out.println("Enter 5 numbers between 10 and 100: ");
	for(i=0; i<5; i++)
	{
	number[i] = consoleInput.nextDouble();
	if(number[i]>=10 && number[i]<=100)
	c++;
	}
	if(c==5)
	{
	for(i=0; i<5; i++)
	{
	d=0;
	for(j=0; j<5; j++)
	if(number[i]/number[j]==1.0)
	d++;
	if(d==1)
	System.out.println(+number[i]);
	}
	}
	else
	System.out.print("Entered values are not between 10 and 100");
	}
}