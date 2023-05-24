package LR12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex7
{
    public static void main(String[] args)
    {
        List<String> strings = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        strings.add("string");
        strings.add("test");
        strings.add("testing string");

        System.out.println("Введите коллекция строк: ");
        for (String str:strings)
        {
            System.out.println(str);
        }

        System.out.println("Введите длину: ");
        int length = in.nextInt();
        List<String> stringsAfter = findLenStr(strings, length);

        System.out.println("Строки длинной больше " + length + ": ");
        for (String str:stringsAfter)
        {
            System.out.println(str);
        }
    }

    public static List<String> findLenStr(List<String> list, int len){
        return list.stream()
                .filter(x -> x.length() > len)
                    .collect(Collectors.toList());
    }
}