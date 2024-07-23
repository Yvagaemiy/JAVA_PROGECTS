package seminar_1.HOME_WORK;


public class  Answer {
public static void main(String[] args) {
    
  

  int nam = 1000;
  boolean b = true;
  for (int i = 2;i <= nam;i++) {
    for(int j = 2; i <= j; j ++)
      if (i % i == 0){
         b = false;
         break;
       } 
        if (b == true){
         System.out.print(j);
        }
      else b = true;
  }
  
}
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки


