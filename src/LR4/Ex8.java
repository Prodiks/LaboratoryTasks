package LR4;

import java.util.Scanner;

public class Ex8
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку для шифрования:");
        String input = in.next();

        System.out.println("Введите ключ:");
        int key = in.nextInt();

        System.out.println("Строка после преобразования:");
        String encryptStr = encryption(input, key);
        System.out.println(encryptStr);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = in.next();
        if(answer.contains("y"))
        {
            System.out.println("Строка после преобразования:");
            String result = decryption(encryptStr, key);
            System.out.println(result);
        }
        else if(answer.contains("n"))
            System.out.println("До свидания!");
        else
        {
            System.out.println("Некорректный ответ");
            return;
        }

        in.close();
    }

    public static String encryption(String str, int key)
    {
        char[] res = str.toCharArray();

        for(int i = 0; i < res.length; i++)
            res[i] += key;

        return new String(res);
    }

    public static String decryption(String str, int key)
    {
        char[] res = str.toCharArray();

        for(int i = 0; i < res.length; i++)
            res[i] -= key;

        return new String(res);
    }
}
