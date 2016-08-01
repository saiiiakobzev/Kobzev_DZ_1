package com.mycompany.dz_1;

import java.util.Scanner;

public class BT_3_1 {
    
    public static void main(String[] arg){
        System.out.println("Рассчитаем объём цилиндра (V), объём полого цилиндра(Vp), площадь боковой поверхности цилиндра (S)");
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Введите длину радиуса поверхности R");
        double R = in.nextInt();
        System.out.println("Введите длину высоты цилиндра h");
        double h = in.nextInt();
        System.out.println("Введите длину радиуса вырезанного цилиндра r");
        double r = in.nextInt();
        
        System.out.println("Объём цилндра (V) равен: " + 3.1415926 * h * R * R);
        System.out.println("Объём полого цилндра (Vp) равен: " + 3.1415926 * h * (R * R - r * r));
        System.out.println("Площадь боковой поверхности цилиндра (S) равна: " + 2 * 3.1415926 * R * h);
    }
    
}
