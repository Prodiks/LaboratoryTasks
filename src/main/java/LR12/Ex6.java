package LR12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex6
{
    public static void main(String[] args)
    {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("Массив: ");
        for (int i = 0; i < 10; i++)
        {
            integers.add(random.nextInt(50));
        }

        for (int i : integers)
        {
            System.out.println(i);
        }

        System.out.println("Делитель: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        List<Integer> integersAfter = findWithoutLast(integers, number);

        System.out.println("Массивбез остатка: ");
        for (int i: integersAfter)
        {
            System.out.println(i);
        }
    }

    public static List<Integer> findWithoutLast (List<Integer> list, int num)
    {
        return list.stream()
                .filter(x -> x % num == 0)
                    .collect(Collectors.toList());
    }
}
