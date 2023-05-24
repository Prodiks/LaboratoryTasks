package LR9.Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) 
    {
        inputArrayExept();
        SumArray(array);
    }
    private static byte[] array;

    private static void inputArrayExept()
    {
        try
        {
            inputArray();
        }
        catch (InputMismatchException exept)
        {
            System.out.println("Ошибка ввода " + exept);
            inputArrayExept();
        }
        catch (Exception exept){
            System.out.println("Ошибка: " + exept);
            inputArrayExept();
        }

    }
    static class ByteRangeException extends InputMismatchException
    {
        ByteRangeException()
        {
            super("Переполнение byte");
        }
    }
    private static void getElem(int i) 
    {
        try 
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите элемент "+"["+(i+1)+"]: ");
            int temp = 0;
            try
            {
                temp = scan.nextInt();
                if(temp < -128 || temp>127) 
                {
                    throw new ByteRangeException();
                }
            }
            catch(ByteRangeException exept)
            {
                System.out.println("Значение за пределами диапазона byte (" + exept + ")");
                getElem(i);
            }
            array[i] = (byte) temp;
        }
        catch(InputMismatchException exept)
        {
            System.out.println("Введите число (" + exept + ")");
            getElem(i);
        }
    }
    private static void inputArray() 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Размер массива: ");
        int size = scan.nextInt();
        array = new byte[size];
        for(int i = 0; i < size; i++)
        {
            getElem(i);
        }
    }

    private static void SumArray(byte [] InputArray)
    {
        int A = 0;
        for (int j: InputArray)
        {
            A += (int) j;
        }
        System.out.println("Сумма элементов массива = ["+(A)+"]");
    }
}

