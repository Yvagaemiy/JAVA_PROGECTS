package semenar_5.AUTOTEST;
// Необходимо разработать программу для сортировки массива целых чисел с использованием 
// сортировки кучей (Heap Sort). Программа должна работать следующим образом:
// Принимать на вход массив целых чисел для сортировки. Если массив не предоставлен,
//  программа использует массив по умолчанию.
// Сначала выводить исходный массив на экран.
// Затем применять сортировку кучей (Heap Sort) для сортировки элементов массива в порядке возрастания.
// Выводить отсортированный массив на экран.
// Ваше решение должно содержать два основных метода: buildTree, который строит сортирующее 
// дерево на основе массива, и heapSort, который выполняет собственно сортировку кучей.
// Программа должна быть способной сортировать массив, даже если он состоит из 
// отрицательных чисел и имеет дубликаты.
// На входе:
// '5 8 12 3 6 9'
// На выходе:
// Initial array:
// [5, 8, 12, 3, 6, 9]
// Sorted array:
// [3, 5, 6, 8, 9, 12]

class HeapSort {
    public static void    heapSort(int[] tree) {
           // Введите свое решение ниже
         int n = tree.length;
         for(int i = n / 2 - 1; i >= 0; i--)
              heapify(tree, i , n);

         for(int i = n - 1; i >= 0; i--){
            int temp = tree[i];
            tree[i] = tree[0];
            tree[0] = temp;
            heapify(tree, 0 , i);
         }
    }

    public static void heapify(int[] Array, int i, int n) {
// Введите свое решение ниже
      int l = i * 2 - 1;
      int r = i * 2 - 2;
      int largest = i;
      if(l < n && Array[l] > Array[largest]){
           largest = l;
      }
      if(r < n && Array[r] > Array[largest]){
            largest = r;
      }
      if( i != largest){
        int temp = Array[i];
        Array[i] = Array[largest];
        Array[largest] = temp;

        heapify(Array, largest, n);
      }
    }
}

// Не удаляйте и не меняйте метод Main! 
public class auto_003_inet {
    public static void main(String[] args) {
        int[] Array = {17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        //heapSort(Array);
        semenar_3.AUTOTEST.auto_003_inet to_003 = new semenar_3.AUTOTEST.auto_003_inet();
       for(int i = 0; i < Array.length; i++){
        System.out.printf(Array[i] + " ");
        
       }
       
       System.out.print(to_003.heapSort(Array));
}

}
