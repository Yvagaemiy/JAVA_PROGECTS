package lecion_11.OOP;

import java.util.Arrays;
import java.util.HashSet;



public class practic{
    public static void main (String [] args ){

    Worker w1 = new Worker();
    w1.last_name = "Фамилия_1:";
    w1.first_name = "Имя_1:";
    w1.salary = 100;
    w1.id = 1000;

    Worker w2 = new Worker();
    w2.last_name = "Фамилия_2:";
    w2.first_name = "Имя_2:";
    w2.salary = 200;
    w2.id = 2000;

    Worker w3 = new Worker();
    w3.last_name = "Фамилия_3:";
    w3.first_name = "Имя_3:";
    w3.salary = 300;
    w3.id = 3000;
      
    Worker w4 = new Worker();
    w4.last_name = "Фамилия_1:";
    w4.first_name = "Имя_1:";
    w4.salary = 100;
    w4.id = 1000;

    System.out.println(w1.toString());
    System.out.println(w2);
    System.out.println(w3);
    System.out.println(w4);

    
    System.out.println(w1 == w4);
    System.out.println(w1.equals(w4));
    var warkers = new HashSet<Worker>(Arrays.asList(w1,w2,w3));
    System.out.println(warkers.contains(w4));
    }
}