package Timus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2100
{
    public static void main(String[] args)
    {
        String inputFileName = "input.txt";
        boolean oj = System.getProperty("judge") != null;
        int marshalAndLilly = 2;

        try
        {
            BufferedReader br =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String readLine = "";

            int numberOfFriends = 0;
            int numberOfPairs = 0;

            while ((readLine = br.readLine()) != null)
            {
                if(numberOfFriends == 0)
                {
                    numberOfFriends = Integer.parseInt(readLine);
                    continue;
                }
                if(readLine.contains("+"))
                {
                    numberOfPairs++;
                }
            }
            int result;
            int guest = (marshalAndLilly + numberOfPairs + numberOfFriends);

            if(guest == 13)
            {
                result = (guest*100) + 100;
            }
            else
            {
                result = guest * 100;
            }
            System.out.println(result);
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }
    }
}