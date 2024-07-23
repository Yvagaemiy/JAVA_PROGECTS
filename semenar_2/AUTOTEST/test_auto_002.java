package semenar_2.AUTOTEST;

import java.util.logging.Logger;

public class test_auto_002 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("semenar_2");
        BubbleSort ob = new BubbleSort(); 
        int arr[] = new int[]{ 9, 4, 8, 3, 1}; 
        System.out.println();
        ob.bubbleSort(arr); 
        logger.info(ob.toString());
       // ob.printArray(arr); 
    } 
}
class BubbleSort { 
        void bubbleSort(int arr[]) 
        { 
            boolean isSorted = false;
            while(!isSorted){
                isSorted = true;
            for (int i = 1; i < arr.length; i++) 
                    if (arr[i] < arr[i - 1]) { 
                        int temp = arr[i]; 
                        arr[i] = arr[i - 1]; 
                        arr[i - 1] = temp; 
                        isSorted = false;
                    } 
                
                printArray(arr);
                System.out.println();
                } 
                
            }
        // Prints the array 
        void printArray(int arr[]) { 
            for (int i = 0; i < arr.length; ++i) 
                System.out.print(arr[i] + " "); 
        } 
}
