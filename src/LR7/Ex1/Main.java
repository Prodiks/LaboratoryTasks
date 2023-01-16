package LR7.Ex1;

public class Main
{
    public static void main(String[] args)
    {
        Animal fish = new Animal("fish");
        Pet dog = new Pet("Tim");
        Pet cat = new Pet("Cat", "Jack");

        System.out.println(fish.toString());
        System.out.println(dog.toString());
        System.out.println(cat.toString());
    }
}
