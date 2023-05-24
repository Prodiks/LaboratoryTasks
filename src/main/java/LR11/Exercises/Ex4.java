package LR11.Exercises;

import java.util.HashMap;
import java.util.Map;

public class Ex4
{
    public static void multiplyOverFive(HashMap<Integer, String> hm)
    {
        int result = 0;
        for(Map.Entry<Integer, String> item : hm.entrySet())
        {
            if(item.getValue().length() > 5)
            {
                if(result == 0) result = item.getKey();
                else result*= item.getKey();
            }
        }
        System.out.println(result);
    }

    public static void findOverFive(HashMap<Integer, String> hm)
    {
        for (int i = 0, j = 5; i <= hm.size(); i++,j++)
        {
            if(hm.get(j) != null)
            {
                System.out.println("Значение: " + hm.get(j));
            }
        }
    }

    public static void findKeyZero(HashMap<Integer, String> hm, int key)
    {
        int count = 0;

        for(Map.Entry<Integer, String> item : hm.entrySet()){
            if(item.getKey() == key) {
                if (count != 0) System.out.println(", ");
                System.out.printf("Значение: %s", item.getValue());
                count++;
            }
        }
    }

    public static void main(String[] args)
    {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

        hash_map.put(0, "Null");
        hash_map.put(1, "1");
        hash_map.put(2, "2");
        hash_map.put(3, "3");
        hash_map.put(4, "4");
        hash_map.put(5, "5");
        hash_map.put(6, "6");
        hash_map.put(7, "7");
        hash_map.put(8, "8");
        hash_map.put(9, "9");

        System.out.println("HashMap: " + hash_map + "\n");

        System.out.println("HashMap, > 5: ");
        findOverFive(hash_map);

        System.out.println("\n\nHashMap,  = 0: ");
        findKeyZero(hash_map, 0);

        System.out.println("\n\nHashMap, перемножение ключей, где длина строки > 5: ");
        multiplyOverFive(hash_map);
    }
}
