package semenar_5.TASK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Задание №0
// 📌 Дана последовательность чисел. Необходимо вернуть сумму
// уникальных чисел
// 📌 Пример: [1, 2, 2, 3]
// 📌 Результат: 4
public class task_001 {
    public static void main(String[] args) {
        //int[] array = int[] new {1,2,3,3};
        
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3));
        task_001 ask_001 = new task_001();
        System.out.print(ask_001.get_sum_array(list));  
         
        }
    
public Integer get_sum_array(final  List<Integer>  list){
            if(list == null || list.isEmpty() ){
                return  0;
            }
          Map<Integer, Integer> map = new HashMap<>();
        for(Integer num : list){
            if(map.containsKey(num)){
                map.put(num,   map.get( num) + 1);
                
            }
            else{
                map.put(num, 1);
            }
            
        }
        int count = 0;
        for(Integer num: map.keySet()){
            System.out.println(map.keySet());  
            if(map.get(num) == 1){
                count = count + num;
            }
        }
       return count;   
    }
}
