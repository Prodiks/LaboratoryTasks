package LR5;

public class Ex1
{
    public static void main(String[] args)
    {
        Char ch = new Char('A');
        ch.printValue();
    }
}

class Char
{
    private char _value;

    public Char(char ch)
    {
        this._value = ch;
    }

    public char getValue()
    {
        return _value;
    }

    public void setValue(char ch)
    {
        this._value = ch;
    }

    public void printValue()
    {
        System.out.printf("val=%c ind=%d", _value, (int)_value);
    }
}
