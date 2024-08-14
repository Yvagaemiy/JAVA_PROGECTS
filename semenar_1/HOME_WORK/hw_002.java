package semenar_1.HOME_WORK;
//сумма чисел от 1 до n),
import java.util.*;
public class hw_002 {
   public static void main(String[] args) {
       Scanner iScanner = new Scanner(System.in);
       System.out.printf("Введите число n: ");
       int n = iScanner.nextInt();

       int sum_n = 0;
       for(int i = 0; i <= n; i++){
        sum_n = sum_n + i;     
       }
       System.out.printf("Сумма от 0 до n = %s",sum_n); 
       }
   }


    

