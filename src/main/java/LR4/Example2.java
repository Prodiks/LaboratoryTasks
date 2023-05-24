package LR4;

public class Example2
{
    public static void main(String[] args)
    {
        String str = "BBBAAA";
        String str2 = getEncryptString(str, 2);
        System.out.println(str2);
    }

    public static String getEncryptString(String encryptString, int shift)
    {
        char[] ArrayChar = encryptString.toCharArray();

        for (int i = 0; i< ArrayChar.length; i++)
            ArrayChar[i] += shift;

        encryptString = new String (ArrayChar);
        return encryptString;
    }
}