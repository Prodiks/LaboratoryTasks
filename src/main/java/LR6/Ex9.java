package LR6;

public class Ex9
{
    public static void main(String[] args)
    {
        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Swaper.print(arr);
        Swaper.swapArray(arr, 0 , arr.length - 1);
        Swaper.print(arr);
    }
}

class Swaper
{
    public static void swapArray(char[] arr, int start, int end)
    {
        if(start >= end)
            return;

        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        swapArray(arr, ++start, --end);
    }

    public static void print(char[] array)
    {
        for(int a: array)
        {
            System.out.printf("%c ", a);
        }
        System.out.println();
    }
}
