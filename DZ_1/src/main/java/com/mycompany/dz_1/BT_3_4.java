package com.mycompany.dz_1;

import java.util.Scanner;

public class BT_3_4 {
    public static void main(String[] arg){
        System.out.println("Рассчитаем объём (V) и площадь поверхности куба (S)");

        Scanner in = new Scanner (System.in);

        System.out.println("Введите длинну стороны a:");
        double a = in.nextInt();
        
        double V = a * a * a;
        double S = 6 * a * a;
        
        System.out.println("Объём куба V равен: " + V);
        System.out.println("Площадь поверхности куба S равна : " + S);
    }
    
}
