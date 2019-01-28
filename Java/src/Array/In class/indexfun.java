import java.util.*;
class fun {
	Scanner consoleInput = new Scanner(System.in);
	Double[] number = new Double[10];
	int i, c=0;
	double a;

	void enterArray() {
	System.out.println("Enter elements of array");
	for(i=0; i<10; i++)
	number[i] = consoleInput.nextDouble();
	}

	void enternumber() {
	System.out.println("Enter a number to search: ");
	a = consoleInput.nextDouble();
	}

	void printArray() {
	System.out.print("Elements of array are\n");
	for(i=0; i<10; i++)
	System.out.print(+ number[i] +"  ");
	}

	void indexOfNumber() {
	System.out.print("\nIndex of number in array: ");
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
class indexfun {
	public static void main(String args[])
	{
		fun f1 = new fun();
		f1.enterArray();
		f1.enternumber();
		f1.printArray();
		f1.indexOfNumber();
	}
}