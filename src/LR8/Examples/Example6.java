package LR8.Examples;

import java.io.*;

public class Example6
{
    public static void main(String[] args) throws IOException
    {
        Reader in = null; // можно сразу записать FileReader in=null;
        Writer out = null; // можно сразу записать FileWriter out =null;
        try
        {
            in = new FileReader("writeFile"); // файл для чтения
            out = new FileWriter("readFile", true); // файл для записи разрешено добавление
            // Данные считываются и записываются побайтно, как и для
            // InputStream/OutputStream
            int oneByte; // переменная, в которую считываются данные
            while ((oneByte = in.read()) != -1)
            {
                // out.write((char)oneByte); // запись с уничтожением ранее
                // существующих данных
                out.append((char)oneByte); // запись с добавлением данных в конец
                System.out.print((char)oneByte);
            }
        }
        catch (IOException e)
        {
            System.out.println("Ошибка!!!! ");
        }
        finally
        {
            in.close();
            out.close();
        }
    }
}
