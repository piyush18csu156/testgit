import java.util.*;
class fun {
	Scanner consoleInput = new Scanner(System.in);
	int i;
	int A[] = new int[5];
	void getArrayElements() {
	System.out.print("Enter elements of Array A: ");
	for(i=0; i<5; i++)
	A[i] = consoleInput.nextInt();

}
	void fun1() {
	int i;
	for(i=0; i<5; i++)
		System.out.print(+A[i] +"  ");
}
void fun2() {
	int i, sum=0;
	for(i=0; i<5; i++)
		sum=sum+A[i];
		System.out.print(+sum);
}
void fun3() {
	int i, max=-32000;
	for(i=0; i<5; i++)
		if(A[i]>max)
			max=A[i];
		System.out.print(+max);
}
void fun4() {
	int i, min = 32000;
	for(i=0; i<5; i++)
		if(A[i] < min)
			min = A[i];
		System.out.print(+min);
}
void fun5() {
	int i, max=-32000, j=0, max1=-32000;
	int B[] = new int[5];
	for(i=0; i<5; i++)
		if(A[i]>max)
			max=A[i];
	for(i=0; i<5; i++)
		if(A[i] == max)
			continue;
		else
			{
				B[j]=A[i];
				j++;
			}
		for(i=0; i<j; i++)
		if(B[i]>max1)
			max1=A[i];
		System.out.print(+max1);
}
void fun6() {
	int i, sum=0, sum1=0;
	for(i=0; i<5; i++)
		if(i%2==0)
		    sum=sum+A[i];
		else
			sum1=sum1+A[i];
		System.out.print(+sum +" and "+sum1);
}
void fun7() {
	int i, s=0;
	for(i=0; i<5; i++)
		if(A[i]%2==0)
			s++;
		System.out.print(+s);
}
void fun8() {
	int i, j, t, pos, min, c;
	for(i=0; i<5; i++)
    {
    min=A[i];
    pos=i;
    for(j=i+1; j<5; j++)
    if(A[j]<min)
    {
    min=A[j];
    pos=j;
    }
    t=A[i];
    A[i]=A[pos];
    A[pos]=t;
    }
    for(i=0; i<5; i=i+c)
    {
    c=0;
    for(j=0; j<5;j++)
    {
    if(A[i]==A[j])
    {
    c++;
    }
    }
    System.out.print(+A[i]+" element is "+c +" time in the array\n");
    }
}
}
class arrayq2 {
	public static void main(String args[])
	{
	fun f1 = new fun();
	Scanner consoleInput = new Scanner(System.in);
	char c;
	do {
	f1.getArrayElements();
	System.out.print("\n1-Elements of array\n2-Sum of all the elements\n3-Largest number in the array\n4-Smallest number in the array\n5-Second largest number in the array\n6-Sum of alternate elements in the array\n7-Count of even numbers in the array\n8-Occurrence of a given number in the array and its frequency\nEnter your choice: ");
	int x = consoleInput.nextInt();
    switch(x)
    {
    case 1: System.out.print("Elements of array: \n");
    f1.fun1();
    break;
    case 2: System.out.print("\nSum of all the elements: ");
    f1.fun2();
    break;
    case 3: System.out.print("\nLargest number in the array: ");
    f1.fun3();
    break;
    case 4: System.out.print("\nSmallest number in the array: ");
    f1.fun4();
    break;
    case 5: System.out.print("\nSecond Largest number in the array: ");
    f1.fun5();
    break;
    case 6: System.out.print("\nSum of alternate elements in the array: ");
    f1.fun6();
    break;
    case 7: System.out.print("\nCount of even numbers in the array: ");
    f1.fun7();
    break;
    case 8: System.out.print("\nOccurrence of a given number in the array and its frequency: \n");
    f1.fun8();
    break;
    default: System.out.print("\nEnter valid choice");
    }
    System.out.print("\nDo you want to repeat the program for some other array Y/N: ");
	c = consoleInput.next().charAt(0);
    }while(c!='N');
    }
}
