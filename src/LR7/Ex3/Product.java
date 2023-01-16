package LR7.Ex3;

public class Product
{
    public int _id;

    Product(int id)
    {
        _id = id;
    }
    public void setData(int id)
    {
        _id = id;
    }

    @Override
    public String toString()
    {
        return "ID: " + _id + "\n";
    }

}
