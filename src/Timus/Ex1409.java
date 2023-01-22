package Timus;

import java.util.Scanner;

public class Ex1409
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String[] num = str.split(" ");
        int res1 = 10 - Integer.valueOf(num[0]);
        int res2 = 10 - Integer.valueOf(num[1]);
        System.out.println(res1);
        System.out.println(res2);
        in.close();
    }
}
