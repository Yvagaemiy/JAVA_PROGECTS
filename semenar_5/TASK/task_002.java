package semenar_5.TASK;
// Задание №1
// 📌 Вам дан массив путей, где пути[i] = [”Город А”, “Город Б”] означают, что

import java.util.HashMap;
import java.util.Map;

// существует прямой путь, идущий от ”Город А” до“Город Б”. Верните
// город назначения, то есть город без какого-либо пути, ведущего в
// другой город.
// 📌 Пример: [["Москва","Самара"],["Курск","Пенза"],["Самара","Курск"]]
// 📌 Результат: Пенза
public class task_002 {
    public static void main(String[] args) {
        Map<String,String> patch = new HashMap<>();
        patch.put("Москва","Самара");
        patch.put("Курск","Пенза");
        patch.put("Самара","Курск");
        task_002 ask_002 = new task_002();
        System.out.println(ask_002.GetCity(patch));
    }
    public String GetCity(Map<String, String> patch){
        for(String end : patch.values()){
            if(!patch.containsKey(end)){
                return end;
            }
        }
          return null;  
    }
}
