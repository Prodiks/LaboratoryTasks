package LR8.Examples;

import java.io.*;

public class Example7
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;

        try
        {
            br = new BufferedReader(new FileReader("readFile"));
            out = new BufferedWriter(new FileWriter("writeFile"));

            int lineCount = 0;
            String s;

            while((s = br.readLine()) != null)
            {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine();
            }
        }
        catch(IOException ex)
        {
            System.out.println("Error:" + ex);
        }
        finally
        {
            br.close();
            out.flush();
            out.close();
        }
    }
}
