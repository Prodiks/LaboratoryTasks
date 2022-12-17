package LR5;

public class Ex4
{
    public static void main(String[] args)
    {
        Pair pair1 = new Pair(5, 'A');
        Pair pair2 = new Pair(-5.65565);

        pair1.printPair();
        pair2.printPair();
    }
}

class Pair
{
    private int _valueInt;
    private char _valueChar;

    Pair(int valueInt, char valueChar)
    {
        _valueInt = valueInt;
        _valueChar = valueChar;
    }

    Pair(double val)
    {
        _valueInt = (int)val;
        _valueChar = (char)Math.abs((int)(100 * (val - _valueInt)));
    }

    public void printPair()
    {
        System.out.printf("(%d, %c)\n", _valueInt, _valueChar);
    }
}
