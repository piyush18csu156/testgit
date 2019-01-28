import java.util.*;
public class ScannerMultiplyNumbers {
    public static void main(String[] args) {
       Scanner consoleInput = new Scanner(System.in);
       System.out.print("Please type two numbers: ");
        int num1 = consoleInput.nextInt();
        int num2 = consoleInput.nextInt();
        int prod = num1 * num2;
        System.out.println("The product is " + prod);
    }}
