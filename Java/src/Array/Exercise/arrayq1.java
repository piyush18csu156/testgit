import java.util.*;
class arrayq1{
	public static void main(String args[])
	{
	Scanner consoleInput = new Scanner(System.in);
	int[][] A = new int[10][10];
	int i, j;
	System.out.print("Enter number of rows of 2D array: ");
	int m = consoleInput.nextInt();
	System.out.print("Enter number of columns of 2D array: ");
	int n = consoleInput.nextInt();
	System.out.print("Enter elements of 2D array: \n");
	for(i=0; i<m; i++)
	for(j=0; j<n; j++)
	A[i][j] = consoleInput.nextInt();
	for(i=0; i<m; i++)
	for(j=0; j<n; j++)
	if(A[i][j]<-99 || A[i][j]>99)
	{
	System.out.print("Please enter element of maximum of 2 digits\n");
	System.out.print("Enter value of A[" +i +"][" +j +"] again: ");
	A[i][j] = consoleInput.nextInt();
	}
	System.out.print("2D Integer Array is:\n");
	for(i=0; i<m; i++)
	{
	for(j=0; j<n; j++)
	System.out.print(+ A[i][j] +" ");
	System.out.print("\n");
	}
	System.out.print("Elements of the array after each element is multiplied by 2 if it is an odd number: \n");
	for(i=0; i<m; i++)
	for(j=0; j<n; j++)
	if(A[i][j]%2==0)
	continue;
	else
	A[i][j] = A[i][j]*2;
	for(i=0; i<m; i++)
	{
	for(j=0; j<n; j++)
	System.out.print(+ A[i][j] +" ");
	System.out.print("\n");
	}
	}
}