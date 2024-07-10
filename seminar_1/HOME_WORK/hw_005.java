package seminar_1.HOME_WORK;
//3. Реализовать простой калькулятор

import java.util.Scanner;

public class hw_005 {
    public static void main(String[] args) {
      Scanner iScanner = new Scanner(System.in);
      
      System.out.print("Введите первое число: ");
      int num_a = iScanner.nextInt();
    
      System.out.print("Выберите знак действия  + , - , *, / :");
      String znak = iScanner.next();
      
      System.out.print("Введите второе число: ");
      int num_b = iScanner.nextInt();
    
      iScanner.close();

      int res = calculecoin(znak, num_a, num_b);

      System.out.printf("%d %s %d = %d", num_a,znak, num_b, res);  
    }
    
    public static int calculecoin(String oper, int a, int b)
    {  
        int  res = 0;
        switch (oper){
            case "+":
                res = (a + b) ;
                break;
            
            case "*":
                res = (a * b) ;
                break;
            
            case "-":
                res = (a - b) ;
                break;
            
            case "/":
                res = (a / b) ;
                break;
        } 
        return res;
//         if oper == "+"){
//            res = (a + b) ;
               
//         }
//         if (oper =="-"){
//            res = (a - b);
           
//         }
//         if (oper =="*"){
//             res = (a * b);
           
//         }
//         if (oper =="/"){
//             res = (a / b);
           
//         }
//     return (res);
    }
}