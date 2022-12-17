package LR5;

public class Ex3
{
    public static void main(String[] args)
    {
        IntegerPair pair1 = new IntegerPair();
        IntegerPair pair2 = new IntegerPair(5);
        IntegerPair pair3 = new IntegerPair(8, 4);

        pair1.printPair();
        pair2.printPair();
        pair3.printPair();
    }
}

class IntegerPair
{
    private int _value1;
    private int _value2;

    IntegerPair()
    {
        _value1 = 0;
        _value2 = 0;
    }

    IntegerPair(int val1)
    {
        _value1 = val1;
        _value2 = 0;
    }

    IntegerPair(int val1, int val2)
    {
        _value1 = val1;
        _value2 = val2;
    }

    public void printPair()
    {
        System.out.printf("(%d, %d)\n", _value1, _value2);
    }
}
