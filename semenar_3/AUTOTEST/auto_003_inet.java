package semenar_3.AUTOTEST;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
      // Введите свое решение ниже
      ArrayList<Integer> num = new ArrayList<>(Arrays.asList(arr));
      Collections.sort(num);
      System.out.println(num);
      System.err.println("Minimum is" + num.get(0));
      System.out.println("Maximum is" + num.get(num.size()-1));
    
      int count = 0;
      int sum_i = 0;
      for(int i : num){
        sum_i+=i;
        count++;

      double res = sum_i / count;
      System.out.println("Average is" + res);
      }
     
    }
  }
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class auto_003_inet{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{ 2, 8};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.analyzeNumbers(arr);
    }
}