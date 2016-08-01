package com.mycompany.dz_1;

import java.util.Scanner;

public class BT_3_3 {
        public static void main(String[] arg){
        System.out.println("Рассчитаем объём (V) и площадь поверхности прямоугольного параллелопипеда (S)");

        Scanner in = new Scanner (System.in);
        
        System.out.println("Введите длинну стороны a:");
        double a = in.nextInt();
        System.out.println("Введите длинну стороны b:");
        double b = in.nextInt();
        System.out.println("Введите длинну стороны c:");
        double c = in.nextInt();
        
        double V = a * b * c;
        System.out.println("Объём равен : " + V);
                
        double S = 2 * (a * b + b * c + a * c);
        System.out.println("Площадь поверхности равна: " + S);
    }
}
