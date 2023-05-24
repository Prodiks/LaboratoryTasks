package LR11.Exercises;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Ex3
{
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        ArrayList<Integer> array_values = new ArrayList<Integer>();

        System.out.println("Кол-во чисел: ");
        int count = in.nextInt();

        System.out.println("Числа: ");
        input(count, array_values);

        System.out.println("Значения: ");
        output(array_values.listIterator());
    }
    public static void input(int count, ArrayList<Integer> arr)
    {
        if(count != 0)
        {
            arr.add(in.nextInt());
            input(count - 1, arr);
        }
    }
    public static void output(ListIterator<Integer> array)
    {
        if(array.hasNext())
        {
            System.out.println(array.next());
            output(array);
        }
    }
}
