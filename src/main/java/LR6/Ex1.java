package LR6;

public class Ex1
{
    public static void main(String[] args)
    {
        PairIntStr pair1 = new PairIntStr();
        PairIntStr pair2 = new PairIntStr();
        PairIntStr pair3 = new PairIntStr();
        PairIntStr pair4 = new PairIntStr();
        PairIntStr pair5 = new PairIntStr();

        pair1.setValue();
        pair2.setValue('a');
        pair3.setValue("String");
        char[] arr = {'1', '2', '3'};
        pair4.setValue(arr);
        char[]arr2 = {'c'};
        pair5.setValue(arr2);

        pair1.print();
        pair2.print();
        pair3.print();
        pair4.print();
        pair5.print();
    }
}

class PairIntStr
{
    private char _valueChar;
    private String _valueString;

    PairIntStr()
    {
        _valueChar = 0;
        _valueString = null;
    }

    PairIntStr(char valueChar)
    {
        _valueChar = valueChar;
        _valueString = null;
    }

    PairIntStr(String valueString)
    {
        _valueChar = 0;
        _valueString = valueString;
    }

    PairIntStr(char[] value)
    {
        if(value.length == 0)
        {
            _valueChar = 0;
            _valueString = null;
        }
        else if(value.length == 1)
        {
            _valueChar = value[0];
            _valueString = null;
        }
        else
        {
            _valueChar = 0;
            _valueString = new String(value);
        }
    }

    public void setValue()
    {
        _valueChar = 0;
        _valueString = null;
    }

    public void setValue(char valueChar)
    {
        _valueChar = valueChar;
        _valueString = null;
    }

    public void setValue(String valueString)
    {
        _valueChar = 0;
        _valueString = valueString;
    }

    public void setValue(char[] value)
    {
        if(value.length == 0)
        {
            _valueChar = 0;
            _valueString = null;
        }
        else if(value.length == 1)
        {
            _valueChar = value[0];
            _valueString = null;
        }
        else
        {
            _valueChar = 0;
            _valueString = new String(value);
        }
    }

    public void print()
    {
        System.out.printf("ch=%c, str=%s\n", _valueChar, _valueString);
    }
}