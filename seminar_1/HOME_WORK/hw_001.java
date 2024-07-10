package seminar_1.HOME_WORK;
//1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
//n * (n + 1) / 2
import java.util.*;
public class hw_001 {
    public static void main(String[] args)
    {
       Scanner nScanner = new Scanner(System.in);
       System.out.printf("Введите число n: ");
       int n = nScanner.nextInt(); 
       
//мой вариант
    //    int res = n * (n + 1) / 2;
    //    System.out.printf("Треугольное число = %s",res);

// вариант из инета
        System.out.printf("Треугольное число = %s", triangl_number(n) );
    }

        public static int triangl_number(int num)
        {
            return num * (num + 1) / 2;
        }
    }
    

