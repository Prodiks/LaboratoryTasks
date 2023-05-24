package LR2;

import java.util.Scanner;

public class Ex4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Write number: ");
        int num = in.nextInt();

        if ((num >= 5) && (num <= 10))
            System.out.printf("5 <= %d <= 10", num);
        else
            System.out.println("Number does not satisfy");

        in.close();
    }
}
