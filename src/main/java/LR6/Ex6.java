package LR6;

public class Ex6
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] slice = Array.slice(arr, 7);
        int[] slice2 = Array.slice(arr, 25);

        Array.print(arr);
        Array.print(slice);
        Array.print(slice2);
    }
}

class Array
{
    public static int[] slice(int[] array, int num)
    {
        if(num > array.length)
            num = array.length;

        int[] result = new int[num];

        for(int i = 0; i < num; i++)
        {
            result[i] = array[i];
        }

        return result;
    }

    public static void print(int[] array)
    {
        for(int a: array)
        {
            System.out.printf("%d ", a);
        }
        System.out.println();
    }


}
