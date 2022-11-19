package LR1;

import java.util.Scanner;

public class Ex6
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Write FIO: ");
        String name1 = in.next();
        String name2 = in.next();
        String name3 = in.next();
        System.out.printf("Hello, %s %s %s", name1, name2, name3);

        in.close();
    }
}
