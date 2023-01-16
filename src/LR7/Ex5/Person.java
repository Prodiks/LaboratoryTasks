package LR7.Ex5;

public class Person
{
    protected String _name;

    Person(String name)
    {
        _name = name;
    }

    public void print()
    {
        System.out.println("Class name: " + this.getClass().getSimpleName() + "\n" +
                           "Name: " + _name + "\n");
    }
}
