import java.util.*;
class arrayq4 {
	public static void main(String args[])
	{
	Scanner consoleInput = new Scanner(System.in);
	int i, j;
	float marks[][] = new float[20][20];
	int A[] = new int[20];
	System.out.print("Enter number of subjects optioned by students minimum 2 and maximum 5 : \n");
	for(i=1; i<=10; i++)
	{
	System.out.print("Subjects optioned by Student "+i+" : ");
	A[i] = consoleInput.nextInt();
	}
	System.out.print("Enter marks in each subject of each student\n");
	for(i=1; i<=10; i++)
	{
	System.out.println("Marks of Student "+i);
	for(j=1; j<=A[i]; j++)
	{
	System.out.print("Subject "+j+" : ");
	marks[i][j] = consoleInput.nextFloat();
	}
	}
	for(i=1; i<=10; i++)
	for(j=A[i]+1; j<=5; j++)
	marks[i][j] = 200;
	for(i=1; i<=5; i++)
	marks[0][i] = i;
	for(i=1; i<=10; i++)
	marks[i][0] = i;
	for(i=1; i<=10; i++)
	{
	float sum=0;
	for(j=1; j<=A[i]; j++)
	sum = sum + marks[i][j];
	marks[i][6] = sum/A[i];
	}
	for(i=1; i<=5; i++)
	{
	float sum1=0;
	int c=0;
	for(j=1; j<=10; j++)
	if(marks[j][i] == 200)
	c++;
	else
	sum1 = sum1 + marks[j][i];
	marks[11][i] = sum1/(10-c);
	}
	System.out.print("Result :\n");
	for(i=0; i<12; i++)
	{
	for(j=0; j<7; j++)
    if(marks[i][j]==200)
    System.out.print("         ");
	else
	System.out.print(+marks[i][j]+"     ");
	System.out.print("\n");
	}
	System.out.print("Summary : \n1st row represents Number of Subjects\n1st column represents Number of Students\nLast row represents average marks in each subject\nLast column represents average marks of each student");
	}
}