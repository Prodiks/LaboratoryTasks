package LR5;

public class Ex5
{
    public static void main(String[] args)
    {
        Integer int1 = new Integer();
        Integer int2 = new Integer(120);
        Integer int3 = new Integer(30);

        System.out.printf("%d\n", int1.getValue());
        System.out.printf("%d\n", int2.getValue());
        System.out.printf("%d\n", int3.getValue());
    }
}

class Integer
{
    private int _value;
    private static final int _max_value = 100;

    Integer(int value)
    {
        _value = (value > _max_value) ? _max_value : value;
    }

    Integer()
    {
        _value = 0;
    }

    public void setValue(int value)
    {
        _value = (value > _max_value) ? _max_value : value;
    }

    public void setValue()
    {
        _value = 0;
    }

    public int getValue()
    {
        return _value;
    }

}

