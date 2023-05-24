package LR11.Exercises;

public class Ex2 {
    public static String tmp = "";
    public static void main(String [] args)
    {
        binary(255);
        System.out.print(tmp);
    }
    public static void binary(int a)
    {
        int b;

        if(a == 0)
        {
            return;
        }

        b = a % 2;
        tmp = b + tmp;
        binary(a/2);
    }
}
