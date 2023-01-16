package LR7.Ex2;

public class Vehicle
{
    private String _factoryName;

    Vehicle(String factoryName)
    {
        _factoryName = factoryName;
    }

    public int getFactoryNameSize()
    {
        return _factoryName.length();
    }


    public void setData(String factoryName)
    {
        _factoryName = factoryName;
    }

    public void setData()
    {
        _factoryName = "empty";
    }

    @Override
    public String toString()
    {
        return "Factory name: " + _factoryName + "\n";
    }
}
