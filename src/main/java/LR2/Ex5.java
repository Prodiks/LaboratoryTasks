package LR2;

import java.util.Scanner;

public class Ex5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Write number: ");
        int num = in.nextInt();
        int digit = 0;
        if (num < 1000)
        {
            System.out.println("Number is too low");
            return;
        }
        for (int i = 0; i < 4; i++)
        {
            digit = num % 10;
            num /= 10;
        }
        System.out.printf("Number o thousands: %d", digit);
        in.close();
    }
}
