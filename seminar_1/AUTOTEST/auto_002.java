package seminar_1.AUTOTEST;
// Напишите функцию printPrimeNums, которая выведет на экран все
//  простые числа в промежутке от 1 до 1000, каждое на новой строке.

// Напишите свой код в методе printPrimeNums класса Answer.

// Вариант с автотеста
public class auto_002{ 
    public static void main(String[] args) { 
    
       Answer ans = new Answer();      
       ans.printPrimeNums();
     }
    }
class Answer {
    public static void printPrimeNums() {
     // Проход начинается с 2, т.к. это число является наименьшим простым
     for (int i = 2; i <= 1000; i++) {

         boolean isPrime = true;

         // Проверка, является ли число i простым
         // Проход по циклу до корня числа,
         // т.к. дальше нет смысла искать, делителей нет.
         for (int j = 2; j <= Math.sqrt(i); j++) {
             if (i % j == 0) {
                 isPrime = false;
                 break;
             }
         }
         // Если число i простое, вывод его на экран
         if (isPrime)
             System.out.println(i);
     }
 }
}








// Сокращенный вариант с автотеста
// public class auto_002 {
// public static void main(String[] args) {
//              // Напишите свое решение ниже
//              // Проход начинается с 2, т.к. это число является наименьшим простым
//              for (int i = 2; i <= 1000; i++) {
//                  boolean isPrime = true;
//                  // Проверка, является ли число i простым
//                  // Проход по циклу до корня числа,
//                  // т.к. дальше нет смысла искать, делителей нет.
//                  for (int j = 2; j <= Math.sqrt(i); j++) {
//                      if (i % j == 0) {
//                          isPrime = false;
//                          break;
//                      }
//                  }
//                  // Если число i простое, вывод его на экран
//                  if (isPrime)
//                     System.out.println(i);
//              }
//          }
//      }
     
    

//мой вариант!!!

// public class auto_002 {
  
//     public static void main(String[] args) {
//             int num = 1000;
//             boolean b = true;
//             for (int j = 2; j <= num; j++) {
//                 for (int i = 2; i < j; i++) {
//                     if (  j% i == 0 ) {
//                         b = false;
//                         break;
//                     }
//                 }
//                 if (b == true){
//                     System.out.println(j);
//                 }
//                 else b = true;
//             }
//         }
//     }

