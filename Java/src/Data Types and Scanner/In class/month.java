import java.util.*;
public class month {
	public static void main(String args[])
	{
	Scanner consoleInput = new Scanner(System.in);
	char c;
	do {
	System.out.print("Enter any number from 1 to 12 : ");
	int a = consoleInput.nextInt();
	if(a==1)
	System.out.print("January\n");
	else if(a==2)
	System.out.print("Feburary\n");
	else if(a==3)
	System.out.print("March\n");
	else if(a==4)
	System.out.print("April\n");
	else if(a==5)
	System.out.print("May\n");
	else if(a==6)
	System.out.print("June\n");
	else if(a==7)
	System.out.print("July\n");
	else if(a==8)
	System.out.print("August\n");
	else if(a==9)
	System.out.print("September\n");
	else if(a==10)
	System.out.print("October\n");
	else if(a==11)
	System.out.print("November\n");
	else if(a==12)
	System.out.print("December\n");
	else
	System.out.print("Enter correct number\n");
    System.out.print("Do you want to continue program Y/N : ");
    c = consoleInput.next().charAt(0);
	}while(c!='N');
	}
}