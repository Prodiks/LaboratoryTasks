package Timus;

import java.util.Scanner;

public class Ex2012
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int f = in.nextInt();

        int a = 12 - f;

        if(a * 45 <= 4 * 60)
            System.out.println("YES");
        else
            System.out.println("NO");

        in.close();
    }
}
