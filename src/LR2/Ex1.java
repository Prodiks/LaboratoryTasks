package LR2;

import java.util.Scanner;

public class Ex1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Write number: ");
        int num = in.nextInt();

        if ((num % 3) == 0)
            System.out.printf("%d is divisible by 3", num);
        else
            System.out.printf("%d is not divisible by 3", num);

        in.close();
    }
}
