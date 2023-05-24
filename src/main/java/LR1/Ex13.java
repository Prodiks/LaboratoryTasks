package LR1;

import java.util.Scanner;

public class Ex13
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Write 2 number: ");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.printf("Sum is: %d", a + b);

        in.close();
    }
}
