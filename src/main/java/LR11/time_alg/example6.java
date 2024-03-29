package LR11.time_alg;

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class example6 {
    public static void main(String[] args) {

        LinkedList<Integer> linkList = new LinkedList<>();
        Set<Integer> treeSet = new TreeSet<>();

        System.out.println("Время выполнения операции удаления элемента в середине linkList = " + getRunningTimeLinkedList(linkList) + " мс");
        System.out.println("Время выполнения операции удаления элемента в середине TreeSet = " + getRunningTimeTreeSet(treeSet) + " мс");

    }

    private static long getRunningTimeLinkedList(LinkedList<Integer> list) {

        for (int i = 0; i < (13 * 1000000); i++) {
            list.add(i);
        }

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция
        list.remove(list.size()/2);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRunningTimeTreeSet(Set<Integer> list) {

        for (int i = 0; i < (13 * 1000000); i++) {
            list.add(i);
        }

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция
        list.remove(list.size()/2);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}
