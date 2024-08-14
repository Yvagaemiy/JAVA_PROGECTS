package semenar_4.HOME_WORK;
// ДЗ
// Даны два Deque представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

// узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть
// отрицательными
// Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и номером группы.
public class hw_001 {
    public static void main(String[] args) {
        Deque<Integer> deque_1 = new ArrayDeque<>(Arrays.asList(1,3,5));
        Deque<Integer> deque_2 = new ArrayDeque<>(Arrays.asList(4,7,3));
        hw_001 hw = new hw_001();
        System.out.println(hw.sum_list(deque_1,deque_2));
        System.out.println(hw.multiply_list(deque_1,deque_2));
    }
    public Deque<Integer> sum_list(Deque<Integer> deque_1,Deque<Integer> deque_2){
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
    public Deque<Integer> multiply_list(Deque<Integer> deque_1,Deque<Integer> deque_2){
            if(deque_1 == null || deque_2 == null){
               throw new IllegalStateException();
            }

            Deque<Double> result_1 = new ArrayDeque<>();
       double digit_1 = 0;
       while(deque_1.size() > 0 || deque_2.size() > 0){
           double multiply = 0 + digit_1;
           digit_1 = 0;
           if(deque_1.size()> 0){
            multiply = multiply * deque_1.poll();
           }
           if(deque_2.size() > 0){
            multiply = multiply * deque_2.poll();
           }
           if(multiply > 9){
               digit_1 = 1;
               multiply = multiply - 10;

           }
           result_1.offer(multiply);
       }
       if(digit_1 !=0){
           result_1.offer(digit_1);
       }
       return result_1; 
    }    
}
}