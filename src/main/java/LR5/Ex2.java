package LR5;

public class Ex2
{
    public static void main(String[] args)
    {
        CharPair pair = new CharPair('n', 'a');
        pair.print_interval();
    }
}

class CharPair
{
    private char _value1;
    private char _value2;

    CharPair(char ch1, char ch2)
    {
        _value1 = ch1;
        _value2 = ch2;
    }

    char[] getInterval()
    {
        int val1 = (int)_value1;
        int val2 = (int)_value2;
        if(val1 > val2)
        {
            int tmp = val1;
            val1 = val2;
            val2 = tmp;
        }

        int interval_length = val2 - val1 + 1;

        char[] interval = new char[interval_length];
        for(int i = 0; i < interval_length; i++)
            interval[i] = (char)((int)val1 + i);

        return interval;
    }

    void print_interval()
    {
        char[] interval = getInterval();

        if(interval == null)
        {
            System.out.printf("Interval is NULL");
            return;
        }

        for(int i = 0; i < interval.length; i++)
            System.out.printf("%c ", interval[i]);
        System.out.printf("\n");
    }
}
