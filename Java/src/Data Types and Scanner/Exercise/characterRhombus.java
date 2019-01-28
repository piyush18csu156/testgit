import java.util.*;
class characterRhombus {
	public static void main(String args[])
	{
	Scanner consoleInput = new Scanner(System.in);
	int i, s, j, k;
	char c, d, e;
	do {
	System.out.println("Enter the number of rows of Character Rhombus: ");
	int n = consoleInput.nextInt();
	for(i=1; i<=n; i++)
	{
	for(s=i; s<=n-1; s++)
	System.out.print(" ");
	for(j=1; j<=i; j++)
	{
	d = (char)(j+64);
	System.out.print(d);
    }
    for(k=i-1; k>=1; k--)
    {
    e = (char)(k+64);
	System.out.print(e);
    }
	System.out.print("\n");
	}
	for(i=n-1; i>=1; i--)
	{
	for(s=i; s<=n-1; s++)
	System.out.print(" ");
	for(j=1; j<=i; j++)
	{
	d = (char)(j+64);
	System.out.print(d);
    }
    for(k=i-1; k>=1; k--)
    {
    e = (char)(k+64);
	System.out.print(e);
    }
	System.out.print("\n");
	}
	System.out.print("\nDo you want to repeat the program Y/N: ");
	c = consoleInput.next().charAt(0);
    }while(c != 'N');
	}
}