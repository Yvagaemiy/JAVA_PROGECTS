package semenar_3.HOME_WORK;

import java.util.*;
public class test {
     public static void main(String[] args) {

        int[] list = {4,3, 1, 5,3, 22, 9, 566, 34, 64};
       
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer temp : list) {
            if(temp % 2 == 1){
            linkedList.add(temp);
            int n_min = 10000000;
            int n_max = 0;
        for (Integer te: linkedList) {
            
                if(te > n_max){
                    n_max = te;
   
                }
                if(te < n_min){
                    n_min = te;
                   
                }
        
            int n_sr = 0;
            int count = 0;
            count++;
            n_sr = n_sr * 111;
            int res = n_sr/count; 
            System.out.println(n_sr);
               
            }
            //System.out.print(n_max);
            System.out.println();
            //System.out.print(n_min);
            //System.out.println(res);
            }
        }
        //printArray(list);
        System.out.println(linkedList);
        
       // System.out.println(max_number(linkedList));                 
        // enqueue(linkedList, 555);
        // System.out.println(linkedList);

        // System.out.println(dequeue(linkedList));

        // System.out.println(linkedList);

        // System.out.println(first(linkedList));
        
    }

    static void enqueue(LinkedList<Integer> list, int number) {
        list.addLast(number);
    }

    static int dequeue(LinkedList<Integer> list) {
        int number = 0;
        number = list.get(0);
        list.remove(0);
        return number;
    }

    static int first(LinkedList<Integer> list) {
        int number = 0;
        number = list.get(0);
        return number;
    }

//    static int max_number(LinkedList<Integer> list, int number){
//             int n_max = 0;
//            for (Integer i : list) 
           
//                if(i > n_max){
//                     n_max = i;
//                 //System.out.println(n_max);
//                } 
//             }
        }

//    void printArray(int [] arr){
//     for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]+ "");
//         }
//    }




