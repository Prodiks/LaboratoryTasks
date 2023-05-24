package LR7.Ex4;

public class Player extends Circle
{
    public int  _id;

    Player(char symbol, String hash, int id)
    {
        super(symbol, hash);
        _id = id;
    }

    Player(Player anotherPlayer)
    {
        _id = anotherPlayer._id;
        _hash = anotherPlayer._hash;
        _symbol = anotherPlayer._symbol;
    }

    @Override
    public String toString()
    {
        return "ID: " + _id + "\n" +
               "Hash: " + _hash + "\n" +
               "Symbol: " + _symbol + "\n";
    }
}
