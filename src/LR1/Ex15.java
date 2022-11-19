package LR1;

import java.util.Scanner;

public class Ex15
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Write two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.printf("Sum = %d, div = %d", num1+num2, num1-num2);

        in.close();
    }
}
