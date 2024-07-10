package SEMINAR_1.TASK;

import java.util.Scanner;

// 📌 Пример 1: а = 3, b = 2, ответ: 9
// 📌 Пример 2: а = 2, b = -2, ответ: 0.25
// 📌 Пример 3: а = 3, b = 0, ответ: 1
public class task_005 {
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        System.out.println("Введите число а : ");
        int number_a = a.nextInt();

        Scanner b = new Scanner(System.in);
        System.out.println("Введите степень числа b : ");
        int number_b = b.nextInt();
// первый вариант
    //    int res = 1;
    //    for(int i = 1; i <=number_b; i++){
    //     res = res * number_a;
    //    }
    //    System.out.println(res);
//второй вариант

        double c = Math.pow(number_a, number_b);
        System.err.println(c);
    }
    
}