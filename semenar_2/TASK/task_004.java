package semenar_2.TASK;
// Задание №4
// 📌 Вам дается строка S и целочисленный массив индексов int

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

// index[s.length]. Напишите программу, которая перетасует
// символы в S таким образом, что символ c i-й позиции
// переместится на индекс index[i] в результирующей строке.
// 📌 Пример: s = “cba”, index = [3,2,1]
// 📌 Результат “abc”
public class task_004 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("semenar_2");
        logger.info("Введите строку");
        String s = iScanner.next();
        int [] array = new int [s.length()];
        for(int i = 0; i < s.length();i++){
            logger.info("Введите значение индекса");
            array[i] = iScanner.nextInt();

        }
        char [] result = new char[s.length()];
        for(int i = 0; i <array.length;i++){
            char temp = s.charAt(i);
            int temp_index = array[i];
            result [temp_index - 1] = temp;

        }
        logger.info(Arrays.toString(result));
    }
}
