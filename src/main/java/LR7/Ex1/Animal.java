package LR7.Ex1;

public class Animal
{
    private String _kindName;

    Animal(String kindName)
    {
        _kindName = kindName;
    }

    @Override
    public String toString()
    {
        String result;
        result = "super" + "\n" +
                 " Class name: " + this.getClass().getSimpleName() + "\n" +
                 " kindName = " + _kindName + "\n";
        return result ;
    }
    public String getKindName()
    {
        return _kindName;
    }
    public void setKindName(String kindName)
    {
        _kindName = kindName;
    }
}
