package LR7.Ex1;

public class Pet extends Animal {
    private String _name;

    Pet(String kindName)
    {
        super(kindName);
        _name = "empty";
    }

    Pet(String kindName, String name)
    {
        super(kindName);
        _name = name;
    }

    @Override
    public String toString()
    {
        String result;
        result = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " kindName = " + this.getKindName() + "\n" +
                " name = " + _name + "\n";
        return result ;
    }

    public String getName()
    {
        return _name;
    }

    public void setName(String name)
    {
        _name = name;
    }
}

