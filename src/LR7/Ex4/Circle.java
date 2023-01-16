package LR7.Ex4;

public class Circle extends Figure
{
    public String _hash;

    Circle(char symbol, String hash)
    {
        super(symbol);
        _hash = hash;
    }

    Circle()
    {
        _hash = null;
        _symbol = 0;
    }
}
