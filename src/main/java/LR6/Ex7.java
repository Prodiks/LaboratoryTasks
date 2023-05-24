package LR6;

public class Ex7
{
    public static void main(String[] args)
    {
        char[] charArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        int [] intArr = CharToInt.toIntArray(charArr);

        CharToInt.print(charArr);
        CharToInt.print(intArr);
    }
}

class CharToInt
{
    public static int[] toIntArray(char[] arr)
    {
        int[] res = new int[arr.length];
        for(int i = 0; i < res.length; i++)
        {
            res[i] = (int)arr[i];
        }
        return res;
    }

    public static void print(int[] array)
    {
        for(int a: array)
        {
            System.out.printf("%d ", a);
        }
        System.out.println();
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

