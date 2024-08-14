package lecion_9;

import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        TreeMap<Integer,String>tMap = new TreeMap<>();
        tMap.put(3, "три");System.out.println(tMap);
        tMap.put(4, "четыре"); System.out.println(tMap);
        tMap.put(5, "пять"); System.out.println(tMap);
       
        System.out.println(tMap.descendingKeySet());
        System.out.println(tMap.descendingMap());
        System.out.println(tMap.values());
        
        tMap.remove(3);System.out.println(tMap.descendingMap());//удаление элемента
        
        for(var item: tMap.entrySet()){
            if (item.getKey() == 5){
                tMap.remove(5);
                System.out.println(tMap.descendingMap());
            }
        }
    }
}
