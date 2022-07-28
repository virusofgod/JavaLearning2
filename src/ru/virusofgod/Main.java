package ru.virusofgod;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //logical operation example 1
        /* {
            Scanner in = new Scanner(System.in);
            if (in.nextInt() > 10) { // шпаргалка (== , > , <, >= , <= , && , || , != ,true , false).
                System.out.println("Условие сгенерировано true");
            } else {
                System.out.println("Условие сгенерировано false");
            }
        }*/
      /*  {
            System.out.print("введите x: ");
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextInt();
            boolean a = !(x < 5 || x > 5 && x < 7);
            System.out.println("----------------------------");
            System.out.println(a);
        }*/

        //boolean
       /* {
            boolean a = true;
            boolean b = false;

            int x = 5;
            boolean b1 = x > 0;
            boolean b2 = b1 && (x <= 20) || a;
        }*/


        //ternary operation
        //example 2.1
            /* {
            int a = 0;
            int b = 20;
            int max = ( a > b? a : b ); //скобки не обязательны
            System.out.println(max);
        }*/

        //example 2.2
            /* {
                int a = -10;
                System.out.println(a > 0 ? a * a : "Wrong");
            }*/

        // example 2.3 -- задача 112165
      /*  {
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println(x<2 && y<x && (x*x)+(y*y)>4 && y>0?"yes" : "no");
        }*/

        // example 2.4 -- задача 112167
   /*   {
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println((y<2-(x*x) && y>x && x<0) || (y<2-(x*x) && y>x && x>=0) ? "yes" : "no");
        }*/

        // if else
      /*  {
            double max;
            double a;
            double b;
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            System.out.println();
            System.out.println();
            System.out.println("Введите два числа и я покажу то которое больше");
            System.out.println("--------------------------------------------------");
            System.out.println("Введите первое число ");
            a = in.nextDouble();
            System.out.println("Введите второе число " );
            b = in.nextDouble();
            System.out.println("--------------------------------------------------");
            if (a > b) {
                System.out.print("Первое число больше");
            } else if (b > a) {
                System.out.print("Второе число больше");
            }

        }*/
        {
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            int x1, x2;
            x1 = in.nextInt();
            if (x1 > 9 && x1 < 99) {
                x2 = x1 % 10;
                x1 = x1 / 10;
                System.out.println(x1 + " ; " + x2);
                if (x1 == x2) {
                    System.out.println("В числе одинаковые цифры");
                } else if (x2 > x1) {
                    System.out.println("В числе вторая цифра больше первой");
                } else if (x1 > x2) {
                    System.out.println("В числе первая цифра больше второй");
                }

            } else {
                System.out.println("Введено не двузначное число");
            }
        }
        }
}