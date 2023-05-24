package LR7.Ex2;

public class Main
{
    public static void main(String[] args)
    {
        Car myCar = new Car("Zavod", 12312312);
        System.out.println(myCar.toString());

        myCar.setData("Another zavod", 123);
        System.out.println(myCar.toString());
    }
}
