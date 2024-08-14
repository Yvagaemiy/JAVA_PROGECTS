package semenar_3.TASK;
// Задание №1
// 📌 Заполнить список десятью случайными числами.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 📌 Отсортировать список методом sort() и вывести его на экран.
//мое решение

// public class task_002 {
//     public static void main(String[] args) {
//     int[] array = new int[]{3,45,12,32,99,19};
   
//     BubbleSort bu = new BubbleSort();
//     bu.bubbleSort(array);
//     bu.printArray(array);
//     }
// }    
// class BubbleSort{
//     void bubbleSort(int[] arr){
//         boolean isSorted = false;
//         while(!isSorted){
//             isSorted = true;
//             for (int i = 1; i < arr.length; i++)
//                 if(arr[i] < arr[i - 1]){
//                     int temp = arr[i];
//                     arr[i] = arr[i - 1];
//                     arr[i - 1] = temp;
//                     isSorted = false;
//                 } 
//         }
//        // printArray(arr);
//     } 
//         void printArray(int[] arr){
//             for (int i = 0; i < arr.length; i++) 
//                 System.out.print(arr[i] + " ");
//             }

// }

//решение с лекции

public class task_002 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(9,4,6,3,1,8,7,2,5));
        task_002 ask_002 = new task_002();//public class task_002 ==task_002 ask_002 = new task_002() иначе не работает
        System.out.println(ask_002.sortByCollectoins(list).toString());
        System.out.println(ask_002.sortByComparator(list).toString());
    }
    public List <Integer> sortByCollectoins (List<Integer> list){
        Collections.sort(list);
            return  list;
    }

    public  List<Integer> sortByComparator(List<Integer> list){
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
}