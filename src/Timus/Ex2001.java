package Timus;

import java.util.Scanner;

public class Ex2001
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String[][] strings = new String[3][2];
        int a[] = new int[3];
        int b[] = new int[3];
        int vedro[] = new int[2];
        int res[] = new int[2];
        strings[0] = in.nextLine().split(" ");
        strings[1] = in.nextLine().split(" ");
        strings[2] = in.nextLine().split(" ");
        for(int i = 0; i < 3; i++)
        {
            a[i] = Integer.valueOf(strings[i][0]);
            b[i] = Integer.valueOf(strings[i][1]);
        }
        vedro[0] = a[2];
        vedro[1] = b[1];
        res[0] = a[0] - vedro[0];
        res[1] = b[0] - vedro[1];

        System.out.print(res[0]);
        System.out.print(" ");
        System.out.print(res[1]);

        in.close();
    }
}
