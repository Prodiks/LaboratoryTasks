package LR1;

import java.util.Scanner;

public class Ex7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Write your name: ");
        String name = in.nextLine();
        System.out.println("Write your height");
        float height = in.nextFloat();
        System.out.printf("%s's height is %.2f", name, height);

        in.close();
    }
}
