package osnovnie_konstrukzii;

public class OK_1_2_4 {

    static int sum;
    public static void main (String [] arg){
        int j;
        int sum = 0;
        int k = 7;

        for (j = 0; j <=100; j+=k) {
            sum = sum + j;
        }
        
        System.out.println("Сумма чисел из диапазона (0; 100), делящихся на 7 равна: " + sum);
    }
}