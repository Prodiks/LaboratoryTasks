package LR11.Exercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество: ");
        int person_count = scanner.nextInt();
        ArrayList<Integer> peopleArrayList = new ArrayList<>();
        LinkedList<Integer> list_people = new LinkedList<>();

        Long startTimeList = System.currentTimeMillis();
        for (int i = 1; i <= person_count; i++)
        {
            list_people.add(i);
        }

        int index = 0;
        while (list_people.size() > 1)
        {
            index = (index + 1) % list_people.size();
            list_people.remove(index);
        }
        Long endTimeList = System.currentTimeMillis();

        System.out.println("Последний оставшийся человек: " + list_people.get(0));

        Long startTimeArray = System.currentTimeMillis();
        for (int i = 1; i <= person_count; i++)
        {
            peopleArrayList.add(i);
        }

        index = 0;
        while (peopleArrayList.size() > 1)
        {
            index = (index + 1) % peopleArrayList.size();
            peopleArrayList.remove(index);
        }
        Long endTimeArray = System.currentTimeMillis();

        System.out.println("Последний человек: " + peopleArrayList.get(0));
        System.out.println("Список: " + (endTimeList  - startTimeList) + " (мс.)");
        System.out.println("Массив: " + (endTimeArray - startTimeArray) + " (мс.)");
    }
}
