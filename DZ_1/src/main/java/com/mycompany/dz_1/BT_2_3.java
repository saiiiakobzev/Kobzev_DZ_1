package com.mycompany.dz_1;

import java.util.Scanner;

public class BT_2_3 {
    public static void main(String[] arg) {
        System.out.println("Рассчитаем периметр (P) и площадь (S) прямоугольника");
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Введите длину стороны a");
        double a = in.nextInt();
        System.out.println("Введите длину стороны b");
        double b = in.nextInt();
        
        double P = 2 * (a + b);
        System.out.println("Периметр прямоугольника (P) равен: " + P);
        
        double S = a * b;
        System.out.println("Площадь прямоугольника (S) равна: " + S);

    }
    

}