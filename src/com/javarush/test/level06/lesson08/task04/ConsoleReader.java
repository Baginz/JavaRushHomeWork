package com.javarush.test.level06.lesson08.task04;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String s = rd.readLine();
        return s;
    }

    public static int readInt() throws Exception
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(rd.readLine());
        return a;

    }

    public static double readDouble() throws Exception
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(rd.readLine());
        return d;
    }

    public static boolean readBoolean() throws Exception
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String s = rd.readLine();
        boolean e = false;
        if (s.equals("true"))
        {
            e = true;
        }
        if (s.equals("false"))
        {
            e = false;
        }
        return e;
    }
}
