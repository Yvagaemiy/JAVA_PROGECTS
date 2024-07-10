package SEMINAR_1.TASK;

// Задание №3
// 📌 Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.
public class task_003 {
    public static void main(String[] args){ 
        int[] arr  = {0,0,1,1,1,1};
    
        int count = 0;
        int i_max = 0;

        for(int i : arr){
            if (i == 1){
                count ++ ;
            }
    
            if ( i == 0){
                if (count != 0){
                    if (i_max < count){
                    i_max = count;
                    }
                    count = 0;
                }
            } 
   
        }
        
        if (count != 0){
            if (i_max < count){
                    i_max = count;
                } 
        }
    System.out.println(i_max);  
       
    }

}   
