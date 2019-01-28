import java.util.*;
class fun {
	Scanner consoleInput = new Scanner(System.in);
	Double number[] = new Double[5];
	int i, j, c=0, d;

	void enterArray() {
	System.out.println("Enter 5 numbers between 10 and 100: ");
	for(i=0; i<5; i++)
	number[i] = consoleInput.nextDouble();
    for(i=0; i<5; i++)
	if(number[i]>=10 && number[i]<=100)
	continue;
    else
    {
    System.out.print("Entered values are not between 10 and 100. Please re-enter\nnumber["+i+"] : ");
    number[i] = consoleInput.nextDouble();
    }
	}

	void printArray() {
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
}
class numberfun {
	public static void main(String args[])
	{
		fun f1 = new fun();
		f1.enterArray();
		f1.printArray();
	}
}