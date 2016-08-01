package com.mycompany.dz_1;

import java.util.Scanner;

public class BT_3_2 {
    public static void main(String[] arg){
        System.out.println("Рассчитаем объём шара (V) и площадь его поверхности (S)");
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Введите длину радиуса шара R");
        double R = in.nextInt();
        
        double V = 4 * 3.1415926 * R * R * R / 3;
        double S = 4 * 3.1415926 * R * R;
        
        System.out.println("Объём шара (V) равен: " + V);
        System.out.println("Площадь поверхности шара (S) равна: " + S);
    }
}
