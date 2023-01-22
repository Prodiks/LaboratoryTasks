package Timus;

import java.util.Scanner;

public class Ex1877
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String str2 = in.nextLine();

        int num1 = Integer.valueOf(str1);
        int num2 = Integer.valueOf(str2);

        if((num1 % 2 == 0) && (num2 % 2 != 0))
            System.out.println("yes");
        else
            System.out.println("no");

        in.close();
    }
}
