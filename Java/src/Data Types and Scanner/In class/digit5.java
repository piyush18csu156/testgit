import java.util.*;
class digit5 {
	public static void main(String args[])
	{
	Scanner consoleInput = new Scanner(System.in);
	char c = ' ';
	do
	{
	int i, d, n, r=0, a;
	System.out.println("Enter 5 digit number: ");
	n = consoleInput.nextInt();
	if (n<=9999 || n>99999)
	{
	System.out.println("Enter number again : ");
    n = consoleInput.nextInt();
    }
	for(i=n; i>0; i=i/10)
	{
	d=i%10;
	r=(r*10)+d;
	}
	for(i=r; i>0; i=i/10)
	{
	a=i%10;
	System.out.print(+a);
	System.out.print("   ");
	}
	System.out.print("\nDo you want to repeat the program Y/N: ");
	c = consoleInput.next().charAt(0);
	}while(c!='N');
	}
}