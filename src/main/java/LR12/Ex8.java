package LR12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex8
{
    public static void main(String[] args)
    {
        List<Integer> integers = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 10; i++)
        {
            integers.add(random.nextInt(50));
        }
        System.out.println("Введите массив: ");
        for (int i: integers)
        {
            System.out.println(i);
        }

        System.out.println("Введите границу: ");
        int num = in.nextInt();

        List<Integer> integersAfter = findBiggerThen(integers, num);

        System.out.println("Результат: ");
        for (int i: integersAfter)
        {
            System.out.println(i);
        }

    }

    public static List<Integer> findBiggerThen(List<Integer> list, int num){
        return list.stream()
                .filter(x -> x > num)
                    .collect(Collectors.toList());
    }
}
