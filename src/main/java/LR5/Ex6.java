package LR5;

public class Ex6
{
    public static void main(String[] args)
    {
        Tuple tuple1 = new Tuple();
        Tuple tuple2 = new Tuple(4, 8);
        Tuple tuple3 = new Tuple();
        tuple3.setValue(10, 13);

        tuple1.print();
        tuple2.print();
        tuple3.print();
    }
}

class Tuple
{
    private int _max;
    private int _min;

    Tuple()
    {
        _max = 0;
        _min = 0;
    }

    Tuple(int val1, int val2)
    {
        if(val1 > val2)
        {
            _max = val1;
            _min = val2;
        }
        else
        {
            _max = val2;
            _min = val1;
        }
    }

    public void setValue(int val)
    {
        if(val > _max)
            _max = val;
        else if(val < _min)
            _min = val;
    }

    public void setValue(int val1, int val2)
    {
        if(val1 > val2)
        {
            _max = val1;
            _min = val2;
        }
        else
        {
            _max = val2;
            _min = val1;
        }
    }

    public void print()
    {
        System.out.printf("(%d, %d)\n", _min, _max);
    }
}
