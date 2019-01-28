import java.util.*;
class pascal {
	public static void main(String args[])
	{
	Scanner consoleInput = new Scanner(System.in);
	int i, s, j, x=1;
	char c;
	do {
	System.out.println("Enter the number of rows of pascal triangle: ");
	int n = consoleInput.nextInt();
	for(i=0; i<n; i++)
	{
	for(s=1; s<n-i; s++)
	System.out.print(" ");
	for(j=0; j<=i; j++)
	{
	if(j==0 || i==0)
	x=1;
	else
	x=x*(i-j+1)/j;
	System.out.print(+x +" ");
	}
	System.out.print("\n");
	}
	System.out.print("\nDo you want to repeat the program Y/N: ");
	c = consoleInput.next().charAt(0);
    }while(c != 'N');
	}
}