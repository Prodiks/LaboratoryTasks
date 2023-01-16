package LR7.Ex3;

public class Vegetable extends Product
{
    public char _article;

    Vegetable(int id, char article)
    {
        super(id);
        _article = article;
    }

    public void setData(int id, char _article)
    {
        super.setData(id);
        _article = _article;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "Article: " + _article + "\n";
    }
}
