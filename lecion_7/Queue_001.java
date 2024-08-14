package lecion_7;

import java.util.LinkedList;
import java.util.*;
public class Queue_001 {
public static void main (String [] args ){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println (queue ); // [1, 2, 3,]
        int item = queue.remove();
        System.out.println (queue ); // [2, 3,]
        queue.offer (2809);
        item = queue.remove();
        System.out.println (queue ); // [3, 4,]
        item = queue.remove();
        System.out.println( queue ); // [4,]
        item = queue.poll();
        System.out.println (queue ); // []
    }
}