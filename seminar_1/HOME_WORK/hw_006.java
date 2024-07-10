package seminar_1.HOME_WORK;
// 4. (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
// заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного
// равенства. Предложить хотя бы одно решение или сообщить, что его нет.
public class hw_006 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 19; k++) {
                    for (int n = 0; n < 9; n++) {
                        for (int m = 0; m < 9; m++) {
                            for (int c = 0; c < 9; c++) {
                                if ((i * 10 + j) + (k * 10 + n) == (m * 10 + c)){
                                    int d = (i * 10 + j);
                                    int e = (k * 10 + n);
                                    int f = (m * 10 + c);
                                    System.out.printf("%d + %d = %d", d , e , f);
                                }
                                
                            }
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }
    }
}
