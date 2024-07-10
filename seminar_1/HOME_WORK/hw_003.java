package seminar_1.HOME_WORK;
//n! (произведение чисел от 1 до n)
import java.util.*;
public class hw_003 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число Факториала :");
        int f = iScanner.nextInt();
        System.out.printf("Факториал числа =  %s", factorial_number(f));
    }
        public static int factorial_number(int fac)
        {
        if (fac == 1){
            return 1;
        }
        else{
            return fac* factorial_number(fac - 1);
        }
    }
}
