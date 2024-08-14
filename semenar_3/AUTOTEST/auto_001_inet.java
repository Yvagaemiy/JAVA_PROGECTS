package semenar_3.AUTOTEST;
// Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел,
// реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.
// Пример
// a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]
import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] ar) {
        // Напишите свое решение ниже
        int n = ar.length;
        if (n <= 1) return ar;
    
        // Разделите массив на две части и рекурсивно отсортируйте их
        int[] left = mergeSort(Arrays.copyOfRange(ar, 0, n / 2));
        int[] right = mergeSort(Arrays.copyOfRange(ar, n / 2, n));
    
        // Объедините эти два массива в один более крупный массив
        return merge(left, right);
      }
    
       // Объединить два отсортированных массива в более крупный отсортированный массив
      private static int[] merge(int[] ar1, int[] ar2) {
        int n1 = ar1.length;
        int n2 = ar2.length;
        int n = n1 + n2;
        int i1 = 0;
        int i2 = 0;
        int[] ar = new int[n];
    
        for (int i = 0; i < n; i++) {
          if (i1 == n1) {
            ar[i] = ar2[i2++];
          } else if (i2 == n2) {
            ar[i] = ar1[i1++];
          } else {
            if (ar1[i1] < ar2[i2]) {
              ar[i] = ar1[i1++];
            } else {
              ar[i] = ar2[i2++];
            }
          }
        }
        return ar;
      }
    
         }
         
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class auto_001_inet{ 
    public static void main(String[] args) { 
        int[] a;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4,12,4,67,4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}