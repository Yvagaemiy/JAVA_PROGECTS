package lecion_9;

import java.util.LinkedHashMap;
public class Linked_Hash_Map {
    public static void main(String[] args) {
        java.util.Map<Integer, String> linked_hash_map = new LinkedHashMap<>();
        linked_hash_map.put(7,"семь");
        linked_hash_map.put(8,"восемь");
        linked_hash_map.put(9,"девять");
        System.out.println(linked_hash_map);
        for(var i : linked_hash_map.entrySet()){
            if(i.getKey() == 8){
                linked_hash_map.remove(8);
                System.out.println(linked_hash_map);
            }
        }
    }
}
