import java.util.*;
class merge {
	public static void main(String args[])
	{
	Scanner consoleInput = new Scanner(System.in);
	int n, m, i, j, k=0;
	int A[] = new int[10];
	int B[] = new int[10];
	int C[] = new int[20];
	System.out.print("Enter length of array A: ");
	n = consoleInput.nextInt();
	System.out.print("Enter elements of Array A: ");
	for(i=0; i<n; i++)
	A[i] = consoleInput.nextInt();
	System.out.print("Enter length of array B: ");
	m = consoleInput.nextInt();
	System.out.print("Enter elements of array B: ");
	for(i=0; i<m; i++)
	B[i] = consoleInput.nextInt();
	i=0;
	j=0;
	while(i<n && j<m)
	{
		if(A[i] < B[j])
			C[k++] = A[i++];
		else
			C[k++] = B[j++];
	}
	while(i<n)
		C[k++] = A[i++];
	while(j<m)
		C[k++] = B[j++];
	System.out.print("Merged array C: ");
	for(i=0; i<(n+m); i++)
	System.out.print(+C[i] + " ");
	}
}