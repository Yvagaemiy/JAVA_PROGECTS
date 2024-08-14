package semenar_4.TASK;
// Задание №0
// Дан Deque состоящий из последовательности цифр. Необходимо проверить,

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

// что последовательность цифр является палиндромом
public class task_001 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,2,5));
        task_001 tesk001 = new task_001();
        System.out.println(tesk001.chekaOn(deque));
    }

public boolean chekaOn( Deque<Integer> deque){
    if(deque == null){
        throw new IllegalStateException();//если ссылка на deque равна null бросаем исключение throw new IllegalStateException()
    }
    if(deque.size()<= 1){
        return true;
    }
    while(deque.size()>=2){
        if(deque.pollFirst() != deque.pollLast()){
            return false;
        }
    }
    return true;
   }
}
