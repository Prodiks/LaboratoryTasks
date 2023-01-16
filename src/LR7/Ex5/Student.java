package LR7.Ex5;

public class Student extends Person
{
    protected char _level;

    Student(String name, char level)
    {
        super(name);
        _level = level;
    }

    @Override
    public void print()
    {
        System.out.println("Class name: " + this.getClass().getSimpleName() + "\n" +
                           "Name: " + _name + "\n" +
                           "Level " + _level + "\n");
    }
}
