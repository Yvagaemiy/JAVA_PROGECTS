package semenar_4.TASK;
// Задание №1
// Даны два Deque представляющие два неотрицательных целых числа. Цифры

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

// хранятся в обратном порядке, и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
public class task_002 {
    public static void main(String[] args) {
        Deque<Integer> deque_1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> deque_2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        task_002 tesk = new task_002();
        System.out.println(tesk.sumArray(deque_1,deque_2));
    }
    public  Deque<Integer> sumArray(Deque<Integer>deque_1,Deque<Integer>deque_2){
        if(deque_1 == null || deque_2 == null){
            throw new IllegalStateException();
        }

        Deque<Integer> result = new ArrayDeque<>();
        int digit = 0;
        while(deque_1.size() > 0 || deque_2.size() > 0){
            int sum = 0 + digit;
            digit = 0;
            if(deque_1.size()> 0){
                sum = sum + deque_1.poll();
            }
            if(deque_2.size() > 0){
                sum = sum + deque_2.poll();
            }
            if(sum > 9){
                digit = 1;
                sum = sum - 10;

            }
            result.offer(sum);
        }
        if(digit !=0){
            result.offer(digit);
        }
        return result;  
    }
       
}
    

