package LR3;

public class Ex8
{
    public static void main(String[] args)
    {
        int count = 10;

        char[] arr = getArray(count);
        printArr(arr);
    }

    public static char[] getArray(int count)
    {
        char[] array = new char[count];
        char[] unExpected = {'A', 'E', 'I', 'O', 'U'};
        char c = 'A';
        for(int i = 0; i < count; )
        {
            if (isArrayContains(unExpected, c))
            {
                c++;
                continue;
            }
            array[i++] = c++;
        }
        return array;
    }

    public static void printArr(char[] arr)
    {
        for (int a: arr)
            System.out.printf("%c ", a);
        System.out.println();
    }

    public static boolean isArrayContains(char[] arr, char c)
    {
        for(char tmp: arr)
            if(tmp == c)
                return true;
        return false;
    }
}
