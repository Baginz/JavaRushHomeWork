package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(rd.readLine());
        int n = Integer.parseInt(rd.readLine());

        for (int i=0;i<m;i++){
            for (int t=0;t<n;t++){
                System.out.print(8);
            }
            System.out.println();
        }


    }
}
