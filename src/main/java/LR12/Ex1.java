package LR12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Размер: ");
        int size = in.nextInt();
        int[] array = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++)
        {
            array[i] = random.nextInt(20);
        }

        System.out.println("Массив: " + Arrays.toString(array));
        int[] results = filterEvenNumbers(array);
        System.out.println("Результат: " + Arrays.toString(results));
    }

    public static int[] filterEvenNumbers(int[] arr)
    {
        return Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                    .toArray();
    }
}
