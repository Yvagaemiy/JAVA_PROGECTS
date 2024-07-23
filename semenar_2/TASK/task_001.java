package semenar_2.TASK;
// 📌 Дано четное число N (>0) и символы c1 и c2.
// 📌 Написать метод, который вернет строку длины N, которая

import java.util.Scanner;
import java.util.logging.Logger;

// состоит из чередующихся символов c1 и c2, начиная с c1.
public class task_001 {
    public static void main(String[] args) throws Exception{
        Scanner iScanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("semenar_2");
        int num ;
        String c1;
        String c2;
        logger.info("Введите значение c1: ");
        c1 = iScanner.next();
        logger.info("Введите значение c2: ");
        c2 = iScanner.next();
        logger.info("Введите длину числа n:");
        num = iScanner.nextInt();

        if(num <= 0 ){
            throw new Exception("Введеное число не коректное!");
        }
        
        for(int i = 0; i < num;i++){

            if (i % 2 == 0){
                System.out.printf(c1);
            }

            if (i % 2 ==1){
                System.out.printf(c2);
            }
        }
    }
}

