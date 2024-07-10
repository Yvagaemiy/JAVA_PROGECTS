


// Задачи для демонстрации
// 1.
// Задана натуральная степень k. Сформировать случайным
// образом список коэффициентов (значения от 0 до 100)
// многочлена многочлен степени k.
// *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
// 1.
// Даны два файла, в каждом из которых находится запись
// многочлена. Сформировать файл содержащий сумму
// многочленов.

import java.util.Scanner;
package lecion_1;
public class Home_Work {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner (System.in);
        System.out.println("ВВедите степень к:");
        int y = iScanner.nextInt();

       
       System.out.println(y);
       iScanner.close();
    }
    
}
