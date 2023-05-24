package LR6;

public class Ex3
{
    public static void main(String[] args)
    {
        int[] array = {1, 5, -1, 9, 0, 8, 12, -4, 2};

        System.out.printf("Max = %d\n", Calculator.getMax(array));
        System.out.printf("Min = %d\n", Calculator.getMin(array));
        System.out.printf("Average = %f\n", Calculator.getAverage(array));
    }
}

class Calculator
{
    public static int getMax(int ... list)
    {
        int max = list[0];
        for(int i = 1; i < list.length; i++)
            if(list[i] > max)
                max = list[i];
        return max;
    }

    public static int getMin(int ... list)
    {
        int min = list[0];
        for(int i = 1; i < list.length; i++)
            if(list[i] < min)
                min = list[i];
        return min;
    }

    public static double getAverage(int ... list)
    {
        int sum = 0;
        for(int i = 1; i < list.length; i++)
            sum += list[i];
        return sum / list.length;
    }
}
