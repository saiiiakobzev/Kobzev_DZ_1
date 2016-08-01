package com.mycompany.dz_1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class BT_2_2 {
public static void main(String[] arg){
        System.out.println("Рассчитаем периметр (P) и площадь (S) треугольника");

        Scanner in = new Scanner (System.in);
        
        System.out.println("Введите длинну стороны a:");
        double a = in.nextInt();
        System.out.println("Введите длинну стороны b:");
        double b = in.nextInt();
        System.out.println("Введите длинну стороны c:");
        double c = in.nextInt();
        
        double P = a + b + c;
        System.out.println("Периметр треугольника P равен: " + P);
        
        double S = sqrt((P/2) * ((P/2) - a) * ((P/2) - b) * ((P/2) - c));
        System.out.println("Площад треугольника S равна: " + S);
    }
}
