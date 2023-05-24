package LR2;

import java.util.Scanner;

public class Ex3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Write number: ");
        int num = in.nextInt();

        if (((num % 4) == 0) && (num >= 10))
            System.out.printf("Number %d satisfies the conditions", num);
        else
            System.out.printf("Number %d does not meet the conditions", num);

        in.close();
    }
}
