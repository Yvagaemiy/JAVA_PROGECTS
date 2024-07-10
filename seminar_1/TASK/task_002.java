package SEMINAR_1.TASK;

import java.time.LocalDateTime;
import java.util.Scanner;


     // Задание №2
    // 📌 В консоли запросить имя пользователя. В зависимости от
    // текущего времени, вывести приветствие вида
    // 📌 "Доброе утро, <Имя>!", если время от 05:00 до 11:59
    // 📌 "Добрый день, <Имя>!", если время от 12:00 до 17:59;
    // 📌 "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    // 📌 "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

   
    
    
public class task_002 {
        public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.
            Scanner iScan = new Scanner(System.in);
            System.out.print("Введите имя!: ");
            String name = iScan.nextLine();
            //System.out.printf("Привет! %s",name);

            LocalDateTime time = LocalDateTime.now();
            int i = time.getHour();

//мой вариант

            // if (i >= 5 && i < 12);
            // {
            //         System.out.printf("Доброе утро! %s", name);
            // }
            // if (i >= 12 && i < 18);
            // {
            //         System.out.printf("Добрый день! %s", name);
            // }
            // if (i >= 18 && i < 23);
            // {
            //         System.out.printf("Добрый вечер! %s" ,name);
            // }        
            // if (i >= 23 && i < 5);
            // {
            //         System.out.printf("Доброй ночи! %s",name);
            // }
//вариант с лекции
            String data_time = " ";

            if (i >= 5 && i < 12);{
                data_time ="Доброе утро! ";
            }
            if (i >= 12 && i < 18);{
                data_time = "Добрый день!";
            }
            if (i >= 18 && i < 23);{
                data_time = "Добрый вечер!";
            }
            if (i == 23 || i < 5);{
                data_time = "Доброй ночи!";
            }
            System.err.println(data_time + "," + name);
            }
        }
