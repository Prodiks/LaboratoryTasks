package LR7.Ex2;

public class Car extends Vehicle
{
    private int _serialNumber;

    Car(String factoryName, int serialNumber)
    {
        super(factoryName);
        _serialNumber = serialNumber;
    }

    @Override
    public void setData(String factoryName)
    {
        super.setData(factoryName);
        _serialNumber = 0;
    }

    @Override
    public void setData()
    {
        super.setData();
        _serialNumber = 0;
    }

    public void setData(int serialNumber)
    {
        super.setData();
        _serialNumber = serialNumber;
    }

    public void setData(String factoryName, int serialNumber)
    {
        super.setData(factoryName);
        _serialNumber = serialNumber;
    }

    @Override
    public String toString()
    {
        return super.toString() +
               "Serial number: " + _serialNumber + "\n";
    }
}
