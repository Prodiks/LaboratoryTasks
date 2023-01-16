package LR7.Ex5;

public class Teacher extends Person
{
    protected int _price;

    Teacher(String name, int price)
    {
        super(name);
        _price = price;
    }

    @Override
    public void print()
    {
        System.out.println("Class name: " + this.getClass().getSimpleName() + "\n" +
                           "Name: " + _name + "\n" +
                           "Price " + _price + "\n");
    }
}
