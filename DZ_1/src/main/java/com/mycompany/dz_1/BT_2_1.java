package com.mycompany.dz_1;

import java.util.Scanner;

public class BT_2_1 {

    public static void main(String[] args) {
        System.out.println("Рассчитаем длину окружности, площадь окружности, площадь кольца");
        
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение R:");
        float R = in.nextInt();
        System.out.println("Введите значение r:");
        float r = in.nextInt();
        System.out.println("Длинна окружности: " + 2 * R * 3.1415926 + ";");
        System.out.println("Площадь окружности: " + R * R * 3.1415926 + ";");
        System.out.println("Площадь кольца: " + (R * R - r * r) * 3.1415926 + ";");

    }
    
}
