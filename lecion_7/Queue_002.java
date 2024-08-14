package lecion_7;
import java.util.*;
import java.util.LinkedList;
public class Queue_002 {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList <Integer>();
        queue.add (1);
        int item = queue.remove();
        queue.offer (2809);
        item = queue.poll();
        System.out.print(queue);
        queue.remove (2809); // зачем
        queue.element();
        queue.peek();
    }
}
    


