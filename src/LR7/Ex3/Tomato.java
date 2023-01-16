package LR7.Ex3;

public class Tomato extends Vegetable
{
    public String _description;

    Tomato(int id, char article, String description)
    {
        super(id, article);
        _description = description;
    }

    public void setData(int id, char article, String description)
    {
        super.setData(id, article);
        _description = description;
    }

    @Override
    public String toString()
    {
        return super.toString() +
               "Description: " + _description;
    }
}
