package LR13;

import java.util.*;

public class Ex5
{
    private static final Object lock = new Object();
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Random random =new Random();
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
        }
        System.out.println("Массив: \n" + integers + "\n");

        int threads = Runtime.getRuntime().availableProcessors();

        List<Thread> threadList = new ArrayList<>();

        for (int i = 0; i < threads; i++) {
            Thread t = new Thread(() -> {
                System.out.println(Thread.currentThread().getName()
                        + " стартс");
                synchronized (lock) {
                    System.out.println(Thread.currentThread().getName()
                            + " окончание поиска: "
                            + Collections.max(integers));
                }
            });
            threadList.add(t);
        }

        for (Thread t : threadList) {
            t.start();
        }
    }
}
