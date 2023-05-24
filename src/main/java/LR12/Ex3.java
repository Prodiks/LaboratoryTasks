package LR12;

import java.util.List;
import java.util.stream.Collectors;

public class Ex3
{
    public static void main(String[] args)
    {
        String str = "В этих решениях мы используем методы filter(), map() и anyMatch(), " +
                     "чтобы применить функции к элементам массивов или списков. " +
                     "Мы также используем лямбда-выражения, чтобы передать функцию в методы.";
        List<String> strings = List.of(str.split(" "));
        System.out.println("\nРазделенная строка: \n");
        for(String s : strings)
        {
            System.out.println(s);
        }

        List<String> stringsAfter = filterCapitalizedStrings(strings);

        System.out.println("\nПреобразованная строка: \n");
        for (String s : stringsAfter)
        {
            System.out.println(s);
        }
    }

    public static List<String> filterCapitalizedStrings(List<String> list)
    {
        return list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                    .collect(Collectors.toList());
    }
}
