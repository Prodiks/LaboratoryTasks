package Timus;

import java.util.Scanner;

public class Ex1293
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        int res = n * a * b * 2;
        System.out.println(res);

        in.close();
    }
}
