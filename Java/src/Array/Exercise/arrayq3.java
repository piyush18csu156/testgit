import java.util.*;
class arrayq3 {
	public static void main(String args[])
	{
	Scanner consoleInput = new Scanner(System.in);
	int i, j;
	int A[][] = new int[7][6];
	System.out.print("Values of products:\nP1 = 100$\nP2 = 200$\nP3 = 300$\nP4 = 400$\nP5 = 500$\n");
	System.out.print("Enter number of products sold by each salesman last week\n");
	for(i=1; i<6; i++)
	for(j=1; j<5; j++)
	{
	System.out.print("P["+i +"] sold by S["+j +"]: ");
	A[i][j] = consoleInput.nextInt();
	}
	System.out.print("Result: \n");
	A[0][1] = 1;
	A[0][2] = 2;
	A[0][3] = 3;
	A[0][4] = 4;
	A[1][0] = 1;
	A[2][0] = 2;
	A[3][0] = 3;
	A[4][0] = 4;
	A[5][0] = 5;
	A[1][5] = (A[1][1]*100) + (A[1][2]*100) + (A[1][3]*100) + (A[1][4]*100);
	A[2][5] = (A[2][1]*200) + (A[2][2]*200) + (A[2][3]*200) + (A[2][4]*200);
	A[3][5] = (A[3][1]*300) + (A[3][2]*300) + (A[3][3]*300) + (A[3][4]*300);
	A[4][5] = (A[4][1]*400) + (A[4][2]*400) + (A[4][3]*400) + (A[4][4]*400);
	A[5][5] = (A[5][1]*500) + (A[5][2]*500) + (A[5][3]*500) + (A[5][4]*500);
	A[6][1] = (A[1][1]*100) + (A[2][1]*200) + (A[3][1]*300) + (A[4][1]*400) + (A[5][1]*500);
	A[6][2] = (A[1][2]*100) + (A[2][2]*200) + (A[3][2]*300) + (A[4][2]*400) + (A[5][2]*500);
	A[6][3] = (A[1][3]*100) + (A[2][3]*200) + (A[3][3]*300) + (A[4][3]*400) + (A[5][3]*500);
	A[6][4] = (A[1][4]*100) + (A[2][4]*200) + (A[3][4]*300) + (A[4][4]*400) + (A[5][4]*500);
	A[6][5] = (A[1][5]) + (A[2][5]) + (A[3][5]) + (A[4][5]) + (A[5][5]);
	for(i=0; i<7; i++)
	{
	for(j=0; j<6; j++)
	System.out.print(+A[i][j] +"         ");
	System.out.print("\n");
	}
	System.out.print("Summary:\n1st Row represents Salesmans\n1st column represents Products\nLast Row represents total sales by the salesperson for last week\nLast column represents total sales of each product for last week");
	}
}