package LR12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Размер: ");
        int size = in.nextInt();
        int[] array_1 = new int[size];
        int[] array_2 = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++)
        {
            array_1[i] = random.nextInt(200);
            array_2[i] = random.nextInt(200);
        }

        System.out.println("Массив1: " + Arrays.toString(array_1));
        System.out.println("Массив2: " + Arrays.toString(array_2));

        int[] arrResult = findCommonElements(array_1, array_2);

        System.out.println("Массив: " + Arrays.toString(arrResult));
    }

    public static int[] findCommonElements(int[] arr1, int[] arr2)
    {
        return Arrays.stream(arr1)
                .filter(x -> Arrays.stream(arr2)
                        .anyMatch(y -> y == x))
                            .toArray();
    }
}
