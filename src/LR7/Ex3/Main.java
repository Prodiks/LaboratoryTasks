package LR7.Ex3;

public class Main
{
    public static void main(String[] args)
    {
        Product product = new Product(3);
        Vegetable vegetable = new Vegetable(2, 'v');
        Tomato tomato = new Tomato(1, 't', "This is tomato");

        System.out.println(product.toString());
        System.out.println(vegetable.toString());
        System.out.println(tomato.toString());
    }
}
