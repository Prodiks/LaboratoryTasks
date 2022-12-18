package LR6;

public class Ex10
{
    public static void main(String[] args)
    {
        int[] res = IntArray.getMinMax(8, 10, -5, 6, 4);
        System.out.printf("Min = %d Max = %d", res[0], res[1]);
    }
}

class IntArray
{
    public static int[] getMinMax(int ... arg)
    {
        int min = 0;
        int max = 0;

        for(int i = 1; i < arg.length; i++)
        {
            if(arg[i] > arg[max])
                max = i;
            else if(arg[i] < arg[min])
                min = i;
        }

        int[] res = { arg[min], arg[max] };
        return res;
    }
}
