package semenar_2.TASK;
// Задание №3
// 📌 Посчитайте сколько ’’драгоценных камней’’ в куче ’’обычных

import java.util.Scanner;
import java.util.logging.Logger;

// камней’’
// 📌 Пример: jewels = “aB”, stones = “aaaAbbbB”
// 📌 Результат: ”a3B1”
public class task_003 {
    public static void main(String[] args) throws  Exception{
        Scanner iScanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("semenar_2");
        logger.info("Введите драгоценные камни: ");
        String jewels = iScanner.next();
        logger.info("Введите обычные камни: ");
        String stones = iScanner.next();
        if (jewels.length() == 0 && stones.length() == 0){
            throw new Exception("Вы пустую строку");
        }
        

        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(char c1 : jewels.toCharArray() ){
            for(char c2 : stones.toCharArray()){
                if(c1 == c2){
                    count ++;
                }
            }
            sb.append(c1)
                .append(":")
                .append(count)
                .append(" ");
            count = 0;
        }
        logger.info(sb.toString());
    }
   
}

