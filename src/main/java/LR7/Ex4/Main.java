package LR7.Ex4;

public class Main
{
    public static void main(String[] args)
    {
        Player player = new Player('h', "test", 123);
        System.out.println(player.toString());
        Player player2 = player;
        System.out.println(player2.toString());
    }
}
