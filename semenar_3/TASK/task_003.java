package semenar_3.TASK;
// Задание №2
// 📌 Создать список типа ArrayList<String>.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 📌 Поместить в него как строки, так и целые числа.
// 📌 Пройти по списку, найти и удалить целые числа.
// Поставьте видео на паузу и выполните
public class task_003 {
    public static void main(String[] args) {
        
        List <String> arrayList = new ArrayList<>(Arrays.asList("e","y","h","3","f","6","g","78"));
        task_003 ask = new task_003();
        ask.printResultOfChek(arrayList);   
    }
      

       
    public void  printResultOfChek(List<String> list){      
        for(String s : list){
            try {
                int i = Integer.valueOf(s);
                System.out.println(i + "-число");  
            } catch (Exception e) {
                System.out.println(s+"- строка");
            }


        }
    }
}
