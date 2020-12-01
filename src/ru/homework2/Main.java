package ru.homework2;

public class Main {

    public static void main(String[] args)
    {
        int mas [] = {0,1,1,1,0,1,0,0,1};
        int i ;

        for ( i = 0; i < mas.length; i++)
        {
            int b = mas[i];
            //System.out.print(b);
            switch (b)
            {

                case 1:
                    mas [i] = 0;
                    break;
                case 0:
                    mas [i] = 1;
                    break;
            }
            System.out.println(mas[i]);
        }

        int a = 0;
        int task2 [] = new int[8];
        while (a < task2.length)
        {
            task2[a] = a * 3;
            //System.out.println(task2[a]);
            a++;
        }

        int task3 [] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int d:task3)
        {
            if (d < 6)
            {
                d = d * 2 ;
            }
        }

        int square [][] = new int[4][4];
        int g = 0;

        for (int h = 0; h < square.length;h++)
        {
            g = (square.length - 1) - h;
            square [h][h] = 1;
            square [h][g] = 1;
            // System.out.println(square[h][0] + " " + square[h][1] + " " + square[h][2] + " " + square[h][3] );

        }

        int maximus [] = {2,3,1,5,2,0,10};
        int maximum = 0;
        int minimum = maximus[1];
        for (int j = 0; j < maximus.length;j++)
        {
            int element = (maximus.length - 1) - j;

            if (maximus[j] > maximus[element] && maximum <  maximus[j])
            {
                maximum = maximus[j];
            }
            else
            {
                if (maximum < maximus[element])
                {
                    maximum =  maximus[element];
                }

            }
            if (maximus[j] < maximus[element] && minimum > maximus[j])
            {
                minimum = maximus[j];
            }
            else
            {

                if (minimum > maximus[element])
                {
                    minimum = maximus[element];
                }
                else
                {
                    if (minimum > maximus[j])
                    {
                        minimum = maximus[j];
                    }
                }
            }

        }
        System.out.println("Максимальное число " + maximum);
        System.out.println("Минимальное число " + minimum);

    }
}
