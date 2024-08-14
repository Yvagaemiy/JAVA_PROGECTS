package lecion_9;


import java.util.HashMap;
public class Hash_Map {
    public static void main(String[] args) {
        java.util.Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");  System.out.println(db);//это метод проверка если токого ключа нет то добавит
       db.put(null, "!null"); System.out.println(db);
        db.put(2, "два"); System.out.println(db);
        System.out.println(db.get(44));
        System.out.println(db.containsValue("один"));//проверка значения
        System.out.println(db.containsKey(1));// проверка ключа
        System.out.println(db.keySet());//получение колекции ключа
        System.out.println(db.values());//получение колекции значения

        for (var item: db.entrySet()) {
             System.out.printf("[%d:%s]\n", item.getKey(),item.getValue());
             System.out.printf("[%d:%s]", item.getKey(),item.getValue());
        }
    }
}
