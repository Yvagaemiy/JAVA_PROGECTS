package SEMINAR_1.TASK;

// Задание №4
// 📌 Во фразе "Добро пожаловать на курс по Java" переставить слова
// в обратном порядке.
public class task_004 {
    public static void main(String[] args) {
        String word = "Добро пожаловать на курс по Java";
        String[] array = word.split(" ");
        for(int i = array.length; i >=0; i--){
            System.out.print(array[i] + " ");
        }
    } 
}
  
