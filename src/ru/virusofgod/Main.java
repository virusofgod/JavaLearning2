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

        // example 2.3
      /*  {
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println(x<2 && y<x && (x*x)+(y*y)>4 && y>0?"yes" : "no");
        }*/




    }
}
