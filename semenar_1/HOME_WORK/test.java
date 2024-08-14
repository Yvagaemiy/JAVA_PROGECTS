package semenar_1.HOME_WORK;
import  java.util.Scanner;
public class test {
    static  Scanner IScanner = new Scanner(System.in);
    public static void main(String[] args) {
      int a = getint();
      int b = getint();
      char op = getOperacion();
      double result = calc(a,b, op);
      System.out.println("результат операции:" + result);
    }


    public static int getint(){

     System.out.println("Введите число: ");
     int num ;
     if (IScanner.hasNextInt() ){
        num = IScanner.nextInt();
     } else{
        System.out.println("Вы ввели не коректный ввод!");
        IScanner.nextInt();
        num = getint();
     }
    return num;

    }

     public static  char getOperacion(){
        System.out.println("Введите операцию:");
        char operacion;
        if (IScanner.hasNext()){
            operacion = IScanner.next().charAt(0);
        }else{
            System.out.println("Вы допустили ошибку");
            IScanner.next();
            operacion = getOperacion();
        }
        return  operacion;

     }
    public static double calc(int a , int b , char op) {
       double result ;
        switch (op){

        case '+':
            result = (a + b) ;
            break;
    
        case '*':
            result = (a * b) ;
            break;
    
        case '-':
            result = (a - b) ;
            break;
    
        case '/':
            result = (a / b) ;
            break;
        default:
        System.out.println("Ввод был не верный ");
        result = calc(a, b, getOperacion());
        } 
return result;
    }
}





       
        
    








  
 
        
      
      
  
  
    
