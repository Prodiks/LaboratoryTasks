package LR12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5
{
    public static void main(String[] args)
    {
        List<String> strings = new ArrayList<>();
        strings.add("test test test");
        strings.add("string string");
        strings.add("ahahhaah ahhahah");

        System.out.println("\nСтроки: \n");
        for (String s: strings)
        {
            System.out.println(s);
        }

        List<String> stringsAfter = findSubString(strings);

        System.out.println("\nСтроки, содержащие string: \n");
        for (String s: stringsAfter)
        {
            System.out.println(s);
        }
    }

    public static List<String> findSubString(List<String> list)
    {
        return list.stream()
                .filter(x -> x.contains("string"))
                    .collect(Collectors.toList());
    }
}
