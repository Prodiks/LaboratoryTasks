package LR9.Exercises;
import java.util.Scanner;
public class Ex1
{
    public static void main(String[] args)
    {
        try
        {
            int[] array = getArray();
            double average = getAverage(array);
            System.out.println("Среднее: " + average);
        }
        catch (Exception ex)
        {
            System.out.println("ERROR: " + ex);
        }
    }

    public static int[] getArray()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        int[] array = new int[size];

        System.out.println("Введите массив:");
        for(int i = 0; i < size; i++)
        {
            array[i] = in.nextInt();
        }

        return array;
    }
    public static double getAverage(int[] array) throws Exception {
        int sum = 0;
        boolean positiveExists = false;

        for(int i: array)
        {
            if(i > 0)
            {
                sum += i;
                positiveExists = true;
            }
        }

        if(!positiveExists)
        {
            throw new Exception("Нет положительных элементов");
        }

        return sum / array.length;
    }


}
