package semenar_2.TASK;
// Задание №2
// 📌 Напишите метод, который сжимает строку.
// 📌 Пример: вход aaaabbbcdd.
import java.util.Scanner;
import java.util.logging.Logger;


public class task_002 {
    public static void main(String[] args)throws Exception {
       Scanner iScanner = new Scanner(System.in);
       Logger logger = Logger.getLogger("semenar_2");
       logger.info("Введите исходную строку!");
       String s = iScanner.next();
       if (s.length() == 0){
        throw  new Exception("Введена пустая строка");
       }
       char c;
       StringBuilder sb = new StringBuilder();
       c = s.charAt(0);
       sb.append(c);
       for(char item: s.toCharArray()){
            if( c != item){
                sb.append(item);
            }
            c = item;
       }
     logger.info(sb.toString());
    }
}
