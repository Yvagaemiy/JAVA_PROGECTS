package semenar_6.TASK;
// Задание №0
// 📌 1. Напишите метод, который заполнит массив из 1000
// элементов случайными цифрами от 0 до 24.
// 📌 2. Создайте метод, в который передайте заполненный выше
// массив и с помощью Set вычислите процент уникальных
// значений в данном массиве и верните его в виде числа с
// плавающей запятой.
// 📌 Для вычисления процента используйте формулу:
// 📌 процент уникальных чисел = количество уникальных чисел *
// 100 / общее количество чисел в массиве.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;



public  class task_001{
    public static void main(String[] args) {
        task_001 ask_001 = new task_001();
        int[] array = ask_001.initArray();
        System.out.println(Arrays.toString(array));
        System.out.println(ask_001.getFavorit_num(array));
        
    }
    //метод создает масив из рандомных чисел от 0-100 с количеством 24
    public int[] initArray(){
       int[]arr = new int[50];
       Random random = new Random();
          for(int i = 0; i < 50; i++){
                arr[i] = random.nextInt(10);
          }
        return arr;
    }

    public float  getFavorit_num(int[] array){
       Set<Integer> set = new HashSet<>();
       for(int num: array){
        set.add(num);
       }
       System.out.println(set.toString());
       float result = set.size() * (100 / array.length);
       return result;
    }
}